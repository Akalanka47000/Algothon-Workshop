import java.io.*;
import java.util.*;

public class Solution {

    static int getCount(List<String> list, int divider) {
        int count = 0;
        for (int j = 0; j < list.size(); j++) {
            int length = 1;
            while (j + length <= list.size()) {
                int sum = 0;
                for (int k = j; k < j + length; k++) {
                    sum += Integer.parseInt(list.get(k));
                }
                if (sum % divider == 0) {
                    count++;
                }
                length++;
            }

        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < t; i++) {
            String firstLine[] = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(firstLine[0]);
            int k = Integer.parseInt(firstLine[1]);
            String numbers[] = reader.readLine().trim().split("\\s+");
            List<String> list = Arrays.asList(numbers);
            System.out.println(getCount(list, k));

        }
    }
}