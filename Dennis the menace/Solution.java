import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        int total = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        Integer[] numberArray = new Integer[numbers.length];

        for (int j = 0; j < numbers.length; j++) {
            numberArray[j] = Integer.parseInt(numbers[j]);
        }

        int numberCount = Integer.parseInt(reader.readLine());

        Arrays.sort(numberArray, Collections.reverseOrder());
        for (int i = 0; i < numberCount; i++) {
            total += numberArray[i];
        }
        System.out.println(total);

    }
}