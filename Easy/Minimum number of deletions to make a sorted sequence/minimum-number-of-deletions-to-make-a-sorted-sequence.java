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
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDeletions(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java
class Solution
{
	public int minDeletions(int a[], int n) 
	{ 
	  
        int[] dp= new int[n];
        Arrays.fill(dp,1);
        int lis= LIS(a,dp);
        int minDelete= a.length-lis;
        return minDelete;
    }
    static int LIS(int[] a, int[] dp){

        for(int i=1; i<a.length;i++){
            
            for(int j=0;j<i;j++){
                if(a[i]>a[j])
                   dp[i]= Math.max(dp[i],dp[j]+1);
            }
        }

        int temp=0;
        for(int e:dp){
            //System.out.print(e+" " );
            temp=Math.max(e,temp);
        }
        return temp;
    }
	 
}