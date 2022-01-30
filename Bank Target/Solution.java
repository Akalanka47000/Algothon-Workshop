import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int transactionCount = Integer.parseInt(reader.readLine().trim());
        String[] transactionData = reader.readLine().trim().split(" ");
        int queryCount = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < queryCount; i++) {
            int output = -1;
            int total = 0;
            int queryValue = Integer.parseInt(reader.readLine().trim());
            for (int j = 0; j < transactionData.length; j++) {
                int transactionValue = Integer.parseInt(transactionData[j].trim());
                total += transactionValue;
                if (total >= queryValue) {
                    output = j + 1;
                    break;
                }

            }
            System.out.println(output);

        }
    }
}