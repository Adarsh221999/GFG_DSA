//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes hereconst int MOD = 1000000007;

       // Your code goes here

     int[] dp = new int[sum+1];

     int m = (int) 1e9+7;

     dp[0]=1;

     for(int i=0;i<n;i++){

         for(int j=sum;j>=0;j--){

             if(j>=arr[i])

             dp[j] = (dp[j]+dp[j-arr[i]])%m;

         }

     }

     return dp[sum];
	} 
}