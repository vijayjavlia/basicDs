/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
            long st=System.currentTimeMillis();
	Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   while(n!=0)
   {
       int size=sc.nextInt();
       int d=sc.nextInt();
       
       int []arr=new int[size];
       int element;
       for(int i=0;i<size;i++)
       {
           arr[i]=sc.nextInt();
       }
       
       while(d!=0){
	    int temp=arr[0],i;
	    for( i=0;i<size-1;i++)
	    {
	        arr[i]=arr[i+1];
	    }
	    arr[i]=temp;
	     d--;
	     }
	    for(int item:arr)
	    {
	        System.out.print(item+" ");
	    } n--;
	      }
   long end=System.currentTimeMillis();
            System.out.println(end-st);
     
   }
}