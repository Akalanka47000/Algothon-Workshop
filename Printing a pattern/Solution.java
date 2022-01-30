import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        if (count == 1) {
            System.out.println("*");
        } else {
            for (int i = 1; i < (count * 2); i++) {
                if (i <= count) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                } else {
                    for (int j = (count * 2 - i); j > 0; j--) {
                        System.out.print("*");
                    }
                }
                System.out.println("");

            }
        }

    }
}