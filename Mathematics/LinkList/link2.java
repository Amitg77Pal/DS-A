import java.util.*;
public class link2 {
    public static void main(String[] args) {
       LinkedList<String> list=new LinkedList<String>();
       list.addFirst("AMIT");
       list.addFirst("KUMAR");
       System.out.println(list);
       list.addLast("Pal");
       list.add("ji");//by default it adds at the end
       System.out.println(list);
       System.out.println(list.size());

       for(int i=0;i<list.size();i++)
       {
        //if(list.get(i)==value) //to find a value
        System.out.print(list.get(i)+"->");
       }
       System.out.println("null");
       list.removeFirst();
       System.out.println(list);
       list.removeLast();
       System.out.println(list);
       list.remove(1);
       System.out.println(list);
    }
    
}
