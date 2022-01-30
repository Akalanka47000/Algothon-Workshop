import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine().trim());
        String[] numbers = reader.readLine().trim().split(" ");
        int[] numberArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numberArray[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(numberArray);
        String result = "";
        for (int i = 0; i < numberArray.length; i++) {
            if (i == 0) {
                result += Integer.toString(numberArray[i]);
            } else {
                result += " " + Integer.toString(numberArray[i]);
            }

        }
        System.out.println(result);

    }
}