import java.io.*;
import java.util.*;

public class Solution {
    public static Set<String> data = new LinkedHashSet<String>();

    public static String function(List<String> list, int startIndex, int size) {
        data.clear();

        int highest = -1;
        boolean setHasDivider = false;
        for (int j = startIndex; j < startIndex + size; j++) {
            String num = list.get(j);

            if (num.equals("1")) {
                return "YES";
            }

            if (Integer.parseInt(num) > highest) {
                highest = Integer.parseInt(num);
            }
            data.add(num);
        }
        for (int d = 2; d <= highest; d++) {
            ArrayList<Boolean> divisibility = new ArrayList<Boolean>();
            setHasDivider = false;
            for (String s : data) {
                if (Integer.parseInt(s) % d == 0) {
                    divisibility.add(true);
                } else {
                    divisibility.add(false);
                }

            }
            if (!divisibility.contains(false)) {
                setHasDivider = true;
                break;
            }

        }
        if (data.size() == size - startIndex && !setHasDivider) {
            return "YES";
        }
        String ans = "";
        if (startIndex + size != list.size()) {
            ans = function(list, startIndex, size + 1);
        } else {
            if (startIndex + 1 != list.size()) {
                ans = function(list, startIndex + 1, 1);
            }
        }
        if (ans.equals("YES")) {
            return ans;
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < t; i++) {
            int size = Integer.parseInt(reader.readLine().trim());
            String array[] = reader.readLine().trim().split("\\s+");
            Set<String> set = new HashSet<>(Arrays.asList(array));
            List<String> list = new ArrayList<String>(set);
            try {
                System.out.println(function(list, 0, 1));
            } catch (StackOverflowError e) {
                System.out.println("Hello");
            }

        }
    }
}