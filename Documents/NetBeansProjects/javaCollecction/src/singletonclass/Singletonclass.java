
package singletonclass;

public class Singletonclass {
    
    private Singletonclass()
    {
        
    }
//    public static Singletonclass item;
   public static Singletonclass obj;
    public static  Singletonclass getInstance()
    {
        if(obj==null)
        {
            obj=new Singletonclass();
        }
        
        return obj; 
    }
}
