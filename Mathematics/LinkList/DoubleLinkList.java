import java.util.*;
public class DoubleLinkList {
    class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;

        }
    }
    Node head;
   
    public void insertAtBegining(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return ;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
         Node currNode=head;
        
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.prev=currNode;

    }
    public void insertAtPositon(int data,int pos){
        Node newNode=new Node(data);
        Node currNode=head;
        int count=1;
        if(pos<=1)
        {
            insertAtBegining(data);
            return;
        }
         
        if(currNode==null||currNode.next==null)
        {
            insertAtEnd(data);
            return;
        }
        while(currNode!=null && count<pos-1)
        {
            currNode=currNode.next;
            count++;
        }
        newNode.prev=currNode;
        newNode.next=currNode.next;
        currNode.next.prev=newNode;
        currNode.next=newNode;

    }
    public void insertAtMiddle(int data){
        if(head==null || head.next==null)
        {
            insertAtBegining(data);
            return;
        }
        Node newNode=new Node(data);
        Node currNode=head;
        int count=1;
        if(currNode!=null)
        {
            count++;
            currNode=currNode.next;
            
        }
        int mid=count/2;
        currNode=head;
        for(int i=0;i<mid-1;i++)
        {
            currNode=currNode.next;
        }
        newNode.next=currNode.next;
        currNode.next=newNode;
        newNode.prev=currNode;
        currNode.next.prev=newNode;

    }
    public void deleteAtBegining(){
        if(head==null)
        {
            return;
        }
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
    }
    public void deleteAtEnd()
    {
        if(head==null)
        {
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.prev.next=null;  
    }
    public void deleteAtPostion(int pos){
        if(pos<=1 || head==null ||head.next==null){
            deleteAtBegining();
            return;
        }
        Node currNode=head;
        int count=1;
        while(currNode==null||currNode.next==null)
        {
            deleteAtEnd();
            return;
        }
        currNode.prev.next=currNode.next;
        currNode.next.prev=currNode.prev;
    }
    public void display(){
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.println(currNode.data+" <-> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        DoubleLinkList list=new DoubleLinkList();
        while(true)
        {
            int choice=sc.nextInt();
            int data,pos;
            switch(choice)
            {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertAtBegining(data);
                    break;

            }
        }


    }
    
}
