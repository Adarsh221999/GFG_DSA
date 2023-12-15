//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int nthPoint(int n)
    {
        
            int n1=1,n2=2;
            int sum=0;
            if(n==1){
                return 1;
            }
            if(n==2){
                return 2;
            }
            else
            {
                for(int i=3;i<=n;i++){
                    sum=(n1+n2)%1000000007;
                    n1=n2;
                    n2=sum;
                }
            }
            return sum%1000000007;
    }
}