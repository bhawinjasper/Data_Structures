public class Lstack {
    Node head;
    Node last;
    Node top;
    int in=-1;
    class Node{
        int data;
        Node next;
        Node(int n){
            this.data=n;
            this.next=null;
        }
    }
    public void  push(int n){
        Node hr=new Node(n);
        if(this.head==null){
           this.head=hr;
           this.last=hr;
           this.top=hr;
           this.in++;
        }else{
            this.last.next=hr;
            this.top=this.last;
            this.last=hr;
            this.in++;
        }

    }
    public  void pop(){
        if (this.head==null){
            System.out.println("under flow");
        }else {
            Lstack.Node temp = this.head;
            if(temp.next==null){
                this.head=null;
                temp=null;
            }
            if(temp!=null) {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }
    public void display(Node t){
        if(t==null){
            return ;
        }
        display(t.next);
        System.out.println(t.data);
        return;

    }

    public static void main(String[] args) {
        Lstack l=new Lstack();
        l.push(10);
        l.push(12);
        l.push(13);
        l.push(14);
        l.push(15);
        l.push(16);
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        l.pop();


        l.display(l.head);
    }

}
