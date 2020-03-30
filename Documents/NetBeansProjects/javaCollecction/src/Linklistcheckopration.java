
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Linklistcheckopration {
    public static void main(String args[])
    {
        
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String a="";
        
        /* Enter your code here. Print output to STDOUT. */
        for(int i=1;i<=A.length();i++)
        {
             a+=String.valueOf(A.charAt(A.length()-i));
             
             
             
        }
        System.out.print(a);
        if(A.equals(a))
        {
           System.out.print("Yes");
        }
        for(int i=0;i<1;i++)
        {
            a=String.valueOf(A.charAt(i)).toUpperCase(); 
           
        }
////        for(int i=0;i<=A.length()-;i++)
//        {
//            a+=String.valueOf(A.charAt(i+1));
//        }
        System.out.print(a);
//         List<Integer>al=new LinkedList();
//                       Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        for(int i=0;i<a;i++)
//        {
//            al.add(sc.nextInt());
//        }
//           int interval=sc.nextInt();
//        
////           for(int j=0;j<interval;j++)
////           {
////            String insert=sc.nextLine();
////           if(insert.equals("Insert"))
////             {
////            int index=sc.nextInt();int element=sc.nextInt();
////              al.set(index,element);
////         }
////            else{
////                if(insert.equals("Delete"))
////                {
////                 al.remove(sc.nextInt());
////                }
////           }
//
//for(int  j=0;j<interval;j++)
//{
//String inset=sc.next();
//if(inset.equals("Insert"))
//{
//     int index=sc.nextInt();
//     int element=sc.nextInt();
//              al.add(index,element);
////System.out.println("rotate now");
//}
//else
//{
//if(inset.equals("Delete"))
//{
//     al.remove(sc.nextInt());
////System.out.println("right think");
//}
//}
//           }
//         for(int i=0;i<al.size();i++)
//         {
//             
//             System.out.print(al.get(i)+" ");
//         }
//         
//        
    }
    }

