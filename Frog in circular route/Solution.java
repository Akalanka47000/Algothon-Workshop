import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        int totalEnergyNeed = 0;
        int totalEnergyGain = 0;
        String[] energyNeeds = {};
        String[] energyGains = {};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        energyNeeds = reader.readLine().trim().split(",");
        energyGains = reader.readLine().trim().split(",");

        for (int i = 0; i < energyNeeds.length; i++) {
            int need = Integer.parseInt(energyNeeds[i].toString().trim());

            totalEnergyNeed += need;

        }
        for (int i = 0; i < energyGains.length; i++) {
            int gain = Integer.parseInt(energyGains[i].toString().trim());
            totalEnergyGain += gain;

        }

        if (totalEnergyNeed > totalEnergyGain) {
            System.out.println(-1);
        } else {
            int start = 0;

            int currentIndex = 0;
            int stopIndex = energyGains.length;
            try {
                while (true) {
                    boolean JumpedALL = false;
                    for (int i = currentIndex; i < stopIndex; i++) {
                        int need = Integer.parseInt(energyNeeds[i].toString().trim());
                        int gain = Integer.parseInt(energyGains[i].toString().trim());
                        if (need <= gain) {
                            JumpedALL = true;

                        } else {
                            JumpedALL = false;
                            break;
                        }

                        if (i == energyGains.length && JumpedALL == false) {
                            stopIndex = currentIndex - 1;
                            currentIndex = 0;
                        }

                    }

                    if (JumpedALL) {
                        start = currentIndex;
                        break;
                    } else {
                        currentIndex += 1;
                    }
                }
            } catch (Exception e) {

            }
            System.out.println(start + 1);
        }
    }
}