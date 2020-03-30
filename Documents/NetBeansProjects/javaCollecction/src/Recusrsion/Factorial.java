/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recusrsion;

/**
 *
 * @author vijay
 */
public class Factorial {
 static long fact(int n)
 {
     long k=1;
     if(n>0)
     return(n*fact(n-1));
       else
     return 1;
 
 }
    public static void main(String[] args) {
        long fact=fact(5);
        System.out.println(fact);
    }
}
