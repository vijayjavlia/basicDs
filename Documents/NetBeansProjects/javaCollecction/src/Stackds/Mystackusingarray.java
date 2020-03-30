/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stackds;


public class Mystackusingarray {

     private  int top;
      private int capacity;
   private  int []stack;
    
      
      public Mystackusingarray ()
      {
          top=-1;
          capacity=10;
          stack=new int[capacity];
      }
      private boolean isfull()
      {
          return top<capacity;
      }
     
     private boolean isempty()
      {
         if(top>=0)
         {
             return true;
         }
         return false;
      }
    public void push(int data) 
    {
        if(isfull())
        {
            
            stack[++top]=data;
//            System.out.println(stack[data]);
        }
        else{
            System.out.println("Reach of Limit");
    }}
    public void pop()
    {
        if(isempty())
        {
        if(top==0)
        {
            System.out.println(stack[top]);
            top--;
            return;
        }
            System.out.println(stack[top--]);
            
        }
        else
            System.out.println("stack is empty");
    }
    public void peek()
    {
        System.out.println(stack[top]);
    }
}
