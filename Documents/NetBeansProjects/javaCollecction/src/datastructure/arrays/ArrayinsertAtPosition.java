package datastructure.arrays;
public class ArrayinsertAtPosition {
    public static void main(String[] args) 
    {
        int []a={5,2,3,2,1};
        int value=4;
        int position=3;
        for(int i=a.length-1;i>position;i--)
        {
            a[i]=a[i-1];
        }
                a[position]=value;
                for(int ad:a)
                    System.out.print(ad+" ");
    }
    
}
