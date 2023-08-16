//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int nums[], int size)
    {
        //Moore's Algorithm
        int curElement=-1;
        int count=0;
        for(int i=0; i<nums.length;i++){
            if(count==0){
                curElement=nums[i];
                count=1;
            }
            else{
                if(nums[i]== curElement) count++;
                else count--;
            }
        }
        count=0;
        for(int e: nums){
            if(e== curElement) count++;
        }
        
        if(count>size/2)
        return curElement;
        
        else return -1;
    }
}