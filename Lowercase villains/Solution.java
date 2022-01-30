import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        int villains=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String people=reader.readLine();
        for(int i=0;i<people.length();i++){
           if (Character.isLowerCase(people.charAt(i))){
               villains+=1;
           }
        }
        System.out.println(villains);
      
    }
}