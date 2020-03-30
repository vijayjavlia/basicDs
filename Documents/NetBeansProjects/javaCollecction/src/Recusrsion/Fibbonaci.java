package Recusrsion;
public class Fibbonaci {
int fib(int n)
{
    if(n==1||n==2)
        return 1;
    return(fib(n-1)+fib(n-2));
}
    public static void main(String[] args) {
        int i;
        Fibbonaci ob=new Fibbonaci();
        
                
        for(i=1;i<=10;i++)
        {
            System.out.println(ob.fib(30));
        }
    }
}
