//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.smithNum(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    static int smithNum(int n) {
        // code here
        int sum = digitSum(n);
        boolean flag = false;
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                flag = true;
                sum -= digitSum(i);
                n /= i;
            }
        }
        if(n != 1)
        sum -= digitSum(n);
        if(flag == true && sum == 0) return 1;
        return 0;
    }
};