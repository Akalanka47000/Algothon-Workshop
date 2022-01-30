// passes 5/6 test cases

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < t; i++) {
            String[] firstLine = reader.readLine().trim().split("\\s+");
            int length = Integer.parseInt(firstLine[0]);
            int totalSum = Integer.parseInt(firstLine[1]);
            String[] array = reader.readLine().trim().split("\\s+");
            List<String> list = Arrays.asList(array);
            System.out.println((int) getSum(totalSum, list));

        }
    }

    public static double getSum(int totalSum, List<String> list) {
        double sum = 0;
        for (String sNum : list) {
            int num = Integer.parseInt(sNum);
            if (totalSum % num == 0) {
                sum = totalSum;
            } else {
                if (num > sum && num <= totalSum) {
                    sum = num;
                }
            }
        }
        list.remove(sum);
        if (sum > 0) {
            sum += getSum(totalSum - (int) sum, list);
        }
        return sum;
    }
}