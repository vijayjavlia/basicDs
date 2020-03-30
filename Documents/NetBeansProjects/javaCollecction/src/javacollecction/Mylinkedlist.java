package javacollecction;
public class Mylinkedlist {

    
    Node head;
    
       public void add(int element)
       {
           
           Node adddata=new Node(element);
            if(adddata==null) 
            {
                head=adddata;
                return;
            }
            Node temp=head;
            while(temp.nextnode!=null)
            {
               temp= temp.nextnode;
            }
            temp.nextnode=adddata;
       }
       public static class Node
    {
       int data;
       Node nextnode;
        public Node(int data)
        {
            this.data=data;
            nextnode=null;
            return;
        }
       
    }
       
        public void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                temp=temp.nextnode;
                System.out.println(temp);
            }
        }
    
}
