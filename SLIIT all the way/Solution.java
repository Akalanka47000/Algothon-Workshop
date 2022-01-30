import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        int occurrences = 0;

        int sCount = 0;
        int lCount = 0;
        int iCount = 0;
        int tCount = 0;

        for (int i = 0; i < line.length(); i++) {
            char cletter = line.charAt(i);
            String letter = String.valueOf(cletter);
            if (letter.equals("S")) {
                sCount += 1;
            } else if (letter.equals("L")) {
                lCount += 1;
            } else if (letter.equals("I")) {
                iCount += 1;
            } else if (letter.equals("T")) {
                tCount += 1;
            }

        }

        while (sCount > 0 && lCount > 0 && iCount > 1 && tCount > 0) {
            sCount -= 1;
            lCount -= 1;
            tCount -= 1;
            iCount -= 2;
            occurrences += 1;
        }

        System.out.println(occurrences);
    }
}