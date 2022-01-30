// timeout at 66.7 pts

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().trim().split(" ");
        int N = Integer.parseInt(firstLine[0].trim().replaceAll("[^0-9]", ""));
        int Q = Integer.parseInt(firstLine[1].trim().replaceAll("[^0-9]", ""));
        String[] NData = reader.readLine().trim().split(" ");
        String[] QData = reader.readLine().trim().split(" ");
        long[] totals = new long[N];
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                totals[i] = Long.parseLong(NData[i].replaceAll("[^0-9]", ""));
            } else {
                totals[i] = totals[i - 1] + Long.parseLong(NData[i].replaceAll("[^0-9]", ""));
            }
        }

        for (int j = 0; j < Q; j++) {
            Long searchValue = Long.parseLong(QData[j]);
            System.out.println(binarySearch(totals, totals.length, searchValue));
        }

    }

    static int binarySearch(long arr[], int n, long x) {
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (r + l) / 2;

            if (arr[m] >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return (l + 1);
    }
}