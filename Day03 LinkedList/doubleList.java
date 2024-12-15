import java.util.*;
class List{
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
          this.data=data;
          this.prev=null;
           this.next=null;
        }
    }
    Node head=null;
    public void insertAtBegin(int data)
    {
        Node newnode=new Node(data);
        
        
        newnode.next=head;
        head=newnode;
        head.prev=null;
        
    }
    public void insertAtEnd(int data)
    {
        if(head==null){
        insertAtBegin(data);
        }
        else
        {
        Node newnode=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }
    }
    public void insertPosition(int data,int position)
    {
        Node newnode=new Node(data);
        Node temp=head;
        if(position==1)
        {
            insertAtBegin(data);
            
        }
        else
        {
            position=position-2;
            while(position>0)
            {
                temp=temp.next;
                position--;
            }
            newnode.next=temp.next;
            temp.next.prev=newnode;
            temp.next=newnode;
            newnode.prev=temp;
        }
    }
    public void deleteEven()
    {
        int count=1;
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.next.next==null)
            {
                temp.next=null;
                return;
            }

            temp.next=temp.next.next;
            temp.next.prev=temp;
            temp=temp.next;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(" ");
    }
    public void sort()
    {
        
    }

}
class doubleList{
    public static void main(String[] args) {
        List list=new List();
        Scanner sc=new Scanner(System.in);
        // list.insertAtBegin(4);
        // list.insertAtEnd(8);
        // list.insertAtBegin(2);
        // //list.insertAtEnd(9);
        // list.insertPosition(5, 3);
        // list.display();
        // list.deleteEven();
        // list.display();
        int size=sc.nextInt();
        while(size>0)
        {
            size--;
            int data=sc.nextInt();
            list.insertAtEnd(data);
            
        }
        list.display();
        list.deleteEven();
        list.display();
        list.sort();
    }
}