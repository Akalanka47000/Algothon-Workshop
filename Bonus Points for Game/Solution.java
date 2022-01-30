import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(reader.readLine().trim());
        if (score >= 35 && score <= 90) {
            for (int i = score; i < score + 5; i++) {
                if (i % 5 == 0 && (i - score) < 3) {
                    score = i;
                    break;
                }

            }
        }
        System.out.println(score);
    }
}