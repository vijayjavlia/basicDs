/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Longestname {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String sts="";
		while(t!=0)
		{
		    int n=sc.nextInt();
		 String st[]=new String[n];
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		         st[i]=sc.next();
		   }
		   int max=st[0].length();

		   for(int j=0;j<n-1;j++)
		   {
		       if(max<st[j+1].length())
		       {
		         sts=st[j+1];
//                           System.out.println(max);
		       }
                       else
                       {
                                              sts=st[0];
                           
                       }
		   }
		   System.out.println(sts);
		    --t;
		}
	}
}