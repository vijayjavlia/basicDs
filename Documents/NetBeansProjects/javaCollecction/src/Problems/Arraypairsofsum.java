/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problems;

import java.util.Scanner;

public class Arraypairsofsum {
    public static void main(String[] args) {
        
    
//    int a[]={1 , 5  ,7 ,1};
//    int sum=8;
//    int i;
//    int co=0;
//    for(i=0;i<a.length;i++)
//    {
//        for(int j=a.length-1;j>i;j--)
//        {
//            if(a[i]+a[j]==sum)
//            {
//                co++;
//            }
//        }
//    }
//        System.out.println(co);
//        
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
                {
		    int n=sc.nextInt();
//		    int sum=sc.nextInt();
		    int a[]=new int[n];
                  for(int i=0;i<a.length;i++)
                   {
                   a[i]=sc.nextInt();
                   }
        
       int co=0;
    for(int i=0;i<a.length;i++)
    {
        for(int j=a.length-1;j>i;j--)
        { 
            int sum=a[i]+a[j];
//            System.out.print(sum+" ");
            if(sum%4==0)
            {
                co++;
            }
        }
    }
        System.out.println(co);
        t--;
		}
	
            
    }
    
}
