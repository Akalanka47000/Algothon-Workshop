import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine().trim());
            String[] passwords = reader.readLine().trim().split(" ");
            String loginAttempt = reader.readLine().trim();
            String ans = passwordCracker(passwords, loginAttempt);
            if (ans.replaceAll(" ", "").length() == loginAttempt.length()) {
                System.out.println(ans);
            } else {
                System.out.println("WRONG PASSWORD");
            }

        }
    }

    public static String passwordCracker(String[] passwords, String loginAttempt) {
        String output = "";
        boolean found = false;
        String newLoginAttempt = "";
        for (int i = 0; i < passwords.length; i++) {
            String pass = passwords[i];
            if (loginAttempt.startsWith(pass)) {
                found = true;
                newLoginAttempt = loginAttempt.replaceFirst(pass, "");
                output = pass + " ";
                break;
            }
        }
        if (found) {
            output += passwordCracker(passwords, newLoginAttempt) + " ";
            String trimmedOutput = output.replaceAll("WRONG PASSWORD", "");
            return trimmedOutput;
        } else {
            return "WRONG PASSWORD";
        }

    }
}