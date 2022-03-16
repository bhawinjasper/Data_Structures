public class Queue {
    int front;
    int rear;
    int arr[];
    int cap;
    Queue(){
        this.front=-1;
        this.rear=-1;
        this.cap=10;
        this.arr=new int[cap];
    }
    public void enqueue(int n){
        if(front==-1){
            this.front=0;
            this.rear=0;
        }else{
            this.rear+=1;
        }
        this.arr[rear]=n;

    }
    public void dequeue(){
        if(front==-1){
            System.out.println("underflow");
        }else if(front+1==rear){
            this.front=-1;
            this.rear=-1;

        }else{
            front++;
        }

    }
    public void display(){
        for(int i=this.front;i<=this.rear;i++){
            System.out.println(this.arr[i]);
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
