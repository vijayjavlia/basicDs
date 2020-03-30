package javacollecction;
public class DoubleendedQueue<E> {
Node head,tail;
 public void addtofirst(E data)
 {
    Node<E> next,prev;
     
     Node<E> toadd = new Node(data);
     if(head==null)
     {
      head=tail=toadd;   
      }
      head.next=toadd;
     toadd.prev=head;
     head=toadd;
    
 }
 public void print() 
 {
     Node <E> next,prev;
    if(head==null)
    {
        System.out.println("no any element");
    }
    try{
    System.out.println(head.data);
 }
    catch(Exception e)
    {
        System.out.println(e.getStackTrace().toString());
    }
 }
 
 public void remove()
 {
     if(head==null)
     {
         System.out.println("null");
     }
     Node<E> next,prev;
     Node<E> toremove=tail;
     tail=tail.next;
     tail.prev=null;
     toremove=null;
     System.out.println(toremove.data);
 }
public static class Node<E>
{
   Node next,prev;
    E  data;
   
    public Node(E data)
{
   this.data=data;
   this.next=this.prev=null;
   return;
}

    
}
}
