
package javacollecction;

import java.util.*;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        
        Queue<Integer>q=new LinkedList();
        q.add(15);
        q.add(22);
        q.add(88);
        q.add(11);
        System.out.println(q.element()+""+q.peek());
       int temp=0;
       int a=100;
        for(int i=2;i<=100;i++)
        {
            if(a%i==0)
            {
                temp++;
            }
        }
        System.out.println(temp);
        
        
             
    }
    }
