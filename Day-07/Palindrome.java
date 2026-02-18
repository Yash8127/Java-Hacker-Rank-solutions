import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n =A.length();
        String r ="";
        for(int i=n-1;i>=0;i--){
         r+=A.charAt(i);   
        }
        if(r.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}