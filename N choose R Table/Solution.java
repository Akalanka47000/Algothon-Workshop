import java.io.*;
import java.util.*;

public class Solution {

    static HashMap<Integer, Integer> factorials = new HashMap<Integer, Integer>();

    static int factorial(int num) {
        if (factorials.containsKey(num)) {
            return factorials.get(num);
        } else {
            int ans = num;
            for (int i = num - 1; i >= 1; i--) {
                ans = ans * i;
            }
            factorials.put(num, ans);
            return ans;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(reader.readLine().trim());
            String line = "";
            line += 1 + " ";
            for (int k = 1; k < num; k++) {
                Integer val = factorial(num) / ((factorial(num - k)) * factorial(k));
                line += val.toString() + " ";
            }
            line += 1 + " ";
            System.out.println(line.trim());
        }
    }
}