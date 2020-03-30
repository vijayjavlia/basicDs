/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.arrays;

import java.util.Scanner;

/**
 *
 * @author vijay
 */
public class Arraydleteaitem {
       static boolean status=false;
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int []a=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a variable are you delete ");
        int var=sc.nextInt();
        
        int j=indexs(a,var,n);
        if(status)
        {
           for(int i=j;i<n-1;i++)
           {
               a[i]=a[i+1];
           }
           for(int item:a)
           {
               System.out.println(item+" ");
           }
        }
       else
        {
            System.out.println("Ivalid variable");
        }
      
}
    
    public static int indexs(int a[],int var,int n)
    {
        for(int i=0;i<n;i++)
        {
           if(a[i]==var)
            {
                System.out.println("true");
                 status=true;
                 return i;
                }
                  }
        return 0;
    }
}
