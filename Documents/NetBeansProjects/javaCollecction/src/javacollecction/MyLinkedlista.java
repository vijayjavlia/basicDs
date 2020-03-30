
package javacollecction;
public class MyLinkedlista {
    Node head;
     int co=0;
   public  void add(int data)
    {
        Node toadd=new Node(data);
        if(isempty())
        {
            head=toadd;
            return;
        }
       Node temp=head;//starting to input
        while(temp.next!=null)
        {
            temp=temp.next;
            
        }
        temp.next=toadd;
    
    }
    
    boolean isempty()
    {
        return head==null;
//        if(head==null){//optional
//           return true;
//        }
//        else
//            return false;
        
    }
     //create new node
      static class Node
      {
          int data;
          Node next;
          public Node(int data)
          {
              this.data=data;
              next=null;
          }
      }
          public void print()
    {
     Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
           void get(int index)
           {
               Node temp=head;
               for(int i=0;i<index;i++)
               {
                   System.out.println(temp.data);
                   temp=temp.next;
                   
               }
           }
           void set(int index,int element)
           {
               Node temp=head;
              
               
                   System.out.println("hello    ");
           }
          public void size()
           {
               
               Node temp=head;
               while(temp!=null)
               {
                   temp=temp.next;
                   co++;
               }
               System.out.println(co);
           }
    
    }

      


