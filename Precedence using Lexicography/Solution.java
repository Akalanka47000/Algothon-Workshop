// passes 5/7 test cases

import java.io.*;
import java.util.*;

public class Solution {
    static ArrayList<String> combinations = new ArrayList<String>();
    static String line = "";

    public static void setCombinations(String word, int startIndex) {
        for (int i = startIndex; i < word.length(); i++) {
            line += Character.toString(word.charAt(i));
            combinations.add(line);
            if (i < word.length()) {
                setCombinations(word, i + 1);
            }
            line = line.substring(0, line.length() - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        ArrayList<String> inputs = new ArrayList<String>();
        for (int i = 0; i < t; i++) {
            int l = Integer.parseInt(reader.readLine().trim());
            String input = reader.readLine().trim();
            inputs.add(input);
        }

        Collections.sort(inputs);
        setCombinations(inputs.get(0), 0);
        Collections.sort(combinations);
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}