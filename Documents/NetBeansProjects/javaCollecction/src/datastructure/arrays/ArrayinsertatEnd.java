package datastructure.arrays;
public class ArrayinsertatEnd {
    public static void main(String[] args) {
        int a[]={5,4,3,7,1};
        int value=44;
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        a[4]=value;
        for(int ar:a)
        System.out.print(ar+" ");
    }
    
}
