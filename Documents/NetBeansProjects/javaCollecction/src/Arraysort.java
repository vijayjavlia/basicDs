/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Arraysort {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
//                System.out.println("enter testcases of array");
		int n=sc.nextInt();
//                System.out.println("enter size of array");
		 int t=sc.nextInt();
		 int []a=new int[t];
		 for(int i=0;i<n;i++)
		 {
			 for(int k=0;k<a.length;k++)
		 {
			 a[k]=sc.nextInt();
		 }
		Arrays.sort(a);
	   System.out.println(a[t-1]);
	        }
}
}