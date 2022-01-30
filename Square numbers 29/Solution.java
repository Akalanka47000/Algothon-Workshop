import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        String[] numbers = reader.readLine().split(" ");
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            double root = Math.sqrt(number);
            if (root == Math.floor(root)) {
                total += number;
            }
        }
        System.out.println(total);

    }
}