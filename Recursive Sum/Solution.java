import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().trim().split(" ");
        String n = firstLine[0];
        int k = Integer.parseInt(firstLine[1]);
        String mainDigit = "";
        for (int i = 0; i < k; i++) {
            mainDigit += n;
        }
        String answer = superDigit(mainDigit);
        System.out.println(answer);
    }

    public static String superDigit(String num) {
        Integer tot = 0;
        for (char c : num.toCharArray()) {
            tot += Integer.parseInt(String.valueOf(c));
        }
        if (tot.toString().length() != 1) {
            tot = Integer.parseInt(superDigit(tot.toString()));
        }
        return tot.toString();
    }
}