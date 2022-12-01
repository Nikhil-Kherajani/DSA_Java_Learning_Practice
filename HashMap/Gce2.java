import java.io.*;
import java.util.*;

public class Gce2{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int[] arr1 = new int[n];

    for(int i=0;i<n;i++)
    {
        arr1[i] = scn.nextInt();
    }

    int m = scn.nextInt();
    int[] arr2 = new int[m];
    for(int i =0;i<m;i++)
    {
        arr2[i] = scn.nextInt();
    }

    HashMap<Integer,Integer> mp = new HashMap<>();
    for(int val : arr1)
    {        
        if(mp.containsKey(val))
        {
            int ans = mp.get(val);
            mp.put(val,ans+1);
        }
        else{
            mp.put(val,1);
        }
    }

    
    for(int val: arr2)
    { 
        if(mp.containsKey(val) && mp.get(val) >0)
        {
            System.out.println(val);
            int ele = mp.get(val);
            mp.put(val,ele-1);
        }
    }
 }

}