public class Lqueue {
    Node head;
    Node last;
    class Node{
        int data;
        Node next;
        Node(int n){
            this.data=n;
            this.next=null;
        }
    }
    public void enqueue(int n){
        Node h=new Node(n);
        if(this.head==null){
            this.head=h;
            this.last=h;
        }else{
            this.last.next=h;
            this.last=h;
        }

    }
    public void dequeue(){
        if(this.head==null){
            System.out.println("underflow");
        }else{
            this.head=this.head.next;
        }
    }
    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Lqueue l=new Lqueue();
        l.enqueue(10);
        l.enqueue(11);
        l.enqueue(12);
        l.enqueue(13);
        l.enqueue(14);
        l.dequeue();
        l.dequeue();
        l.display();
    }
}
