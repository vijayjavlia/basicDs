/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.arrays;


public class ArrayinsertatStart {
    public static void main(String[] args) {
        int a[]={1,2,5,6,8};
        int val=4;
        
        for(int i=a.length-1;i>0;i--)
        {
           a[i]=a[i-1];  
        }
        a[0]=val;
        for(int af:a)
        {
            System.out.println(af+" ");
        }
    }
    
}
