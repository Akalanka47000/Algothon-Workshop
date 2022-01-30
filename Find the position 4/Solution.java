import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().trim().split(", ");
        Integer searchHeight = Integer.parseInt(reader.readLine().trim());

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            Integer heightInt = Integer.parseInt(numbers[i]);
            if (searchHeight <= heightInt) {
                index = i + 1;
                break;
            } else {
                index = numbers.length;
            }
        }
        System.out.println(index);

    }
}