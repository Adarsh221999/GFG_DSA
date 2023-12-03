//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
          int size=arr.length, left=0, right=0, res=0;
        
        while(right<size-1) {
            int farthest=0;
            
            for(int i=left; i<=right; i++) {
                farthest=Math.max(farthest, i+arr[i]);
            }
            
            if(farthest==0) return -1;
            
            left=right+1;
            right=farthest;
            res+=1;
        }
        
        return res;
    }
}