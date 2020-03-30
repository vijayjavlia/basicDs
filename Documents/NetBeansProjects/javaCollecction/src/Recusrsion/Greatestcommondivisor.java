package Recusrsion;
public class Greatestcommondivisor 
{
    public static void main(String[] args) {
        Greatestcommondivisor ob=new Greatestcommondivisor();
        System.out.println (ob.gcd(105,91));
        
    }
    int gcd(int a,int b)
    {
        if(a==b)
            return a;
        if(a%b==0)
        {
          return b;            
        }
        if(b%a==0)
        {
          return a;            
        }
        if(a>b)
        {
          return gcd(a%b,b);            
        }else
        {
            return gcd(a,b%a);
        }
    }
}
