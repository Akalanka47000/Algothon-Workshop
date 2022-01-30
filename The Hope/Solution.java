import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < caseCount; i++) {
            Integer value = Integer.parseInt(reader.readLine().trim());
            if (!(value.toString().replace("16", "")).equals(value.toString()) || value % 16 == 0) {
                System.out.println("Oh man this is horrable");
            } else {
                System.out.println("Its perfect dude");
            }
        }
    }
}