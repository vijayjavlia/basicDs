/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stackds;

/**
 *
 * @author vijay
 */
public class MyStackUsingdynamicarray {
     
    private int count=0;
    private int top;
    private int  size=1;
    private int[]arr;
     public MyStackUsingdynamicarray()
     {  
         top=-1;
         arr=new int[size];
     }
      
    void push(int data)
    {
       
       
        arr[++top]=data;
        count++;
         resize();
         
    }
    void pop()
    {
        if(top==-1)
         System.out.println("Stack is Overflow");
           else
            System.out.println(arr[top--]);
        count--;
    }

    private void resize() {
       
            int []temp=arr;
            size++;
           arr= new int[size];
            for(int i=0;i<temp.length;i++)
                arr[i]=temp[i];
        
    }
    public void size()
    {
        if(count<=0)
            System.out.println("0");
        else
            System.out.println(count);
    }
}
