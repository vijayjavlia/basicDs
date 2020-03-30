/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollecction;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author vijay
 */
public class vectors {
    public static void main(String args[]){
    List<Integer>v=new Vector <>();
    v.add(2);
//        System.out.println(v);
    v.add(5);
        for(int a:v)
        {
            System.out.print(a);
        }
    
}
}