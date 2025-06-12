public class ssl_r {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
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
    public void reverseIterative()
    {
        if(head==null||head.next==null)
        {
            return; // List is empty or has only one element
        }
        Node prev=head;
        Node curr=head.next;
        
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
            
    }
    public Node reverseRecursive(Node head)
    {
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;

    }
        public void printlist()
        {
            if(head==null)
            {
                System.out.println("List is empty");
                return;
            }
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data + " -> ");
                curr=curr.next;
            }
            System.out.println("null");
            
        }

    
    public static void main(String[] args){
        ssl_r list=new ssl_r();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        // list.printlist();
        // list.reverseIterative();

        
        list.reverseIterative();
        list.printlist();
    }
    
}
