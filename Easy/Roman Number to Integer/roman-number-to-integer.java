//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
           int ans=0;
        int a[] = {1,5,10,50,100,500,1000}; //Values
        int k=0;
        char b[] = {'I','V','X','L','C','D','M'};  //Key

         //outer loop for iterate each char of input
        for(int i=str.length()-1; i>=0; i--){

            char c = str.charAt(i);
            if(i==str.length()-1){
                for(int j=0; j<7; j++){
                    if(c == b[j]){
                        ans = a[j];
                        k=j;
                        j=7;
                    }
                }
            }else{
                for(int j=0; j<7; j++){
                    if(c == b[j] && k<=j){
                        ans += a[j];
                        k=j;
                        j=7;
                    }else if(c == b[j] && k>j){
                        ans-=a[j];
                        k=j;
                        j=7;
                    }
                    
                }
            }
        }
        
        return ans;
    }
}