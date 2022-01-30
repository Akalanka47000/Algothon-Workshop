import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(reader.readLine().trim());
            int result = 1;
            for (int j = 1; j < (num + 1); j++) {
                result = result * j;
            }
            System.out.println(result);
        }

    }
}