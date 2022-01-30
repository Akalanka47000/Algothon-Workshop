import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int throwCount = Integer.parseInt(reader.readLine().trim());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < throwCount; i++) {
            numbers.add(Integer.parseInt(reader.readLine().trim()));
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);
        for (Integer num : numbers) {
            System.out.print(num);
        }
    }
}