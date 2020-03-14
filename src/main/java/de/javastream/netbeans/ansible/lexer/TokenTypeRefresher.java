/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Used for refresh mappings from AnsibleIniAntlrLexer.tokens to TokenType enum
 *
 * @author 6PATyCb
 */
public class TokenTypeRefresher {

    public static void main(String[] args) throws IOException {
        String dirPath = "./src/main/java/de/javastream/netbeans/ansible/lexer";
        Properties prop = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(new File(dirPath + "/AnsibleIniAntlrLexer.tokens"))) {
            prop.load(fileInputStream);
        }
        Enumeration names = prop.propertyNames();
        Map<String, Integer> tokensMap = new HashMap<>();
        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            if (name.startsWith("'")) {//ignore primitives
                continue;
            }
            String idStr = (String) prop.get(name);
            System.out.println(name + "=" + idStr);
            try {
                tokensMap.put(name, Integer.parseInt(idStr));
            } catch (NumberFormatException ignored) {
            }
        }

        File file = new File(dirPath + "/TokenType.java");
        boolean wasChanges = false;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            Pattern pattern = Pattern.compile("^(\\s*\\/\\/)*(\\s*)([A-Z0-9_]+)\\((\\d+),\\s*(\"[^\"]*\")\\)([,;]+)");
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                boolean lastRowFinded = false;
                String ws = "";
                if (matcher.find()) {
                    System.out.println("!!" + line);
                    String comment = matcher.group(1);
                    ws = matcher.group(2);
                    String name = matcher.group(3);
                    int oldId = Integer.parseInt(matcher.group(4));
                    String category = matcher.group(5);
                    String delimiter = matcher.group(6);

                    Integer newId = tokensMap.get(name);
                    if (newId == null) {//mark as deleted
                        System.out.println("!!!!del");
                        if (comment != null) {//if old comment, remove this row
                            continue;
                        }
                        sb.append("//");
                        newId = oldId;
                    } else {
                        if (comment != null) {//if old comment need to be remove
                            wasChanges = true;
                        }
                    }
                    if (!newId.equals(oldId)) {
                        wasChanges = true;
                    }
                    tokensMap.remove(name);
                    if (delimiter.contains(";")) {
                        lastRowFinded = true;
                    }
                    delimiter = !tokensMap.isEmpty() ? "," : ";";
                    line = ws + name + "(" + newId + ", " + category + ")" + delimiter;
                    System.out.println("!replace!" + line);

                }
                sb.append(line).append("\r\n");
                if (lastRowFinded) {
                    int size = tokensMap.size();
                    int counter = 0;
                    for (Map.Entry<String, Integer> entry : tokensMap.entrySet()) {
                        wasChanges = true;
                        counter++;
                        String name = entry.getKey();
                        int newId = entry.getValue();
                        String delimiter = ",";
                        if (counter == size) {
                            delimiter = ",;";
                        }
                        line = ws + name + "(" + newId + ", \"\")" + delimiter;
                        sb.append(line).append("\r\n");
                    }
                }
            }
            System.out.println("!!" + sb.toString());
        }
        // replace a word in a file
        //   String newtext = oldtext.replaceAll("drink", "Love");
        //            //To replace a line in a file
//            //String newtext = oldtext.replaceAll("This is test string 20000", "blah blah blah");
        if (wasChanges) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(sb.toString());
            }
        } else {
            System.out.println("!!noChanges");
        }
    }
}
