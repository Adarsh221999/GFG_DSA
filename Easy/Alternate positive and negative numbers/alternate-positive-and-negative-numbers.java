//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        int[] a=new int[n];
        int[] b=new int[n];
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                a[x]=arr[i];
                x++;
            }
            if(arr[i]<0){
                b[y]=arr[i];
                y++;
            }
        }
        int l=0,m=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(l<x){
                    arr[i]= a[l++];
                }else{
                    arr[i]= b[m++];
                }
            }
            else{
                if(m<y){
                     arr[i]= b[m++];
                }else{
                    arr[i]= a[l++];
                }
           }
       }
       
    }
}