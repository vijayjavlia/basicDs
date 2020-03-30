package javacollecction;

import singletonclass.Singletonclass;

public class Test {
public static void main(String []args) 
{
    int a=2;
    int b=5;
    if(a>b)
    {
        System.out.println("hello world");
    }
    Singletonclass obj=Singletonclass.getInstance();
    
    System.out.println();
}
}
