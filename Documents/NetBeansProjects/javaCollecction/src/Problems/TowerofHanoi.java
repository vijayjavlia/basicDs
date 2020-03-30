
package Problems;

import java.util.Scanner;

public class TowerofHanoi {
    
    static void tower(int n,char beg,char end,char aux)
    {
        if(n>=1)
        {
            tower(n-1,beg,aux,end);
            System.out.println(n+"moves to"+beg+" to "+end);
            tower(n-1,aux,end,beg);
        }
    }
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char beg='B';
        char aux='A';
        char end='E';
        tower(n,beg,aux,end);
        
    }
   
}
