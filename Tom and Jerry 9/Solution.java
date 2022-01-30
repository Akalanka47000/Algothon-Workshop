import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int candies=Integer.parseInt(reader.readLine());
        Integer[] Lnumbers={0,1,7,8};
        ArrayList<Integer> losingNumbers=new ArrayList<Integer>(Arrays.asList(Lnumbers));
      
        for(int i=11;i<=candies;i++){
            if(!losingNumbers.contains(i-5) && !losingNumbers.contains(i-3) && !losingNumbers.contains(i-2)){
                losingNumbers.add(i);
            }
        }
    
        if(losingNumbers.contains(candies)){
            System.out.println("Jerry");
        }else{
            System.out.println("Tom");
        }
    }
}