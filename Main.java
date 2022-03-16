import java.util.*;


    class Node{
        Node head=null;
        int data;
        Node next;
        Node(int n){
            this.data=n;
            this.next=null;
        }

    public void insert(int n){
        Node ne=new Node(n);
        if(this.head==null){
            this.head=ne;
        }
        Node te=this.head;
        while(te.next!=null){
            te=te.next;
        }
        te.next=ne;
    }
    public void delete(int n){
          Node tem=this.head;
          while(tem!=null){
              if(tem.data==n){
                  this.head=tem.next;
                  break;
              }else{
                  if (tem.next.data==n){
                      tem.next=tem.next.next;
                      break;
                  }
              }
          }

    }
}
class Main
{
    public static void main(String args[])
    {
       LinkedList<Integer> l=new LinkedList<>();
       LinkedList<Integer> k=l;
        System.out.println(l==k);
    }
}
