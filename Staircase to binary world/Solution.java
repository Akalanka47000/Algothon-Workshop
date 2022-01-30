import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int steps = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j < (steps - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println("");

        }
    }
}