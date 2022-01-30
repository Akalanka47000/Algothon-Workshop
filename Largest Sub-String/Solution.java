import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine().trim());
        String numbers = reader.readLine().trim();
        String largestSubString = "";
        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j < length + 1; j++) {
                int oneCount = 0;
                int zeroCount = 0;
                String subString = numbers.substring(i, j);
                for (int k = 0; k < subString.length(); k++) {
                    if (subString.charAt(k) == '1') {
                        oneCount += 1;
                    } else {
                        zeroCount += 1;
                    }
                }
                if (zeroCount > oneCount && subString.length() > largestSubString.length()) {
                    largestSubString = subString;
                }

            }

        }
        System.out.println(largestSubString.length());

    }
}