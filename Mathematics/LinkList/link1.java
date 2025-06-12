

public class link1 {
    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;//create a new node(single node)
            this.next=null;
            size++;
        }
    }
    Node head;
    private int size;
    link1()
    {
        this.size=0;
    }

    //add->first
    public void addFirst(String data)
    { 
        
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add->last
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
       Node currentNode=head;
       while(currentNode.next!=null)
       {
            currentNode=currentNode.next;
       }
       currentNode.next=newNode;
    }
    //print the list
    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;

        }
        System.out.println("null");
    }
    //delete first node
    public void deleteFirst(){
        if(head==null){//corner cases
            System.out.println("The list is Empty");
            return;
        }
        size--;
        head=head.next;
    }
    //delete last node
    public void deleteLast(){
         if(head==null){//corner cases
            System.out.println("The list is Empty");
            return;
        }
        size--;
        if(head.next==null){//if only one node is present
            //corner case
            head=null;
            return;
        }
       Node currentNode=head.next;
       Node prevNode=head;
       while(currentNode.next!=null)
       {
        currentNode=currentNode.next;
        prevNode=prevNode.next;
       }
       prevNode.next=null;
    }
    public int getSize()
    {
        return size;
    }

    public static void main(String[] args)
    {
        link1 list=new link1();//create a object
        list.addFirst("kumar");
        list.addFirst("Amit");
        list.printList();
       
        list.addLast("Pal");
        list.printList();
        list.addFirst("My name is");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
    
}
