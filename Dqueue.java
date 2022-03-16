import java.util.Arrays;

public class Dqueue {
    int front;
    int rear;
    int arr[];
    int cap;
    Dqueue(){
        this.front=-1;
        this.rear=-1;
        this.cap=10;
        this.arr=new int[cap];
    }
    public void fenqueue(int n){
        if(front==rear&&front!=-1){
            System.out.println("overflow");
        }else{
            if(front==-1){
                this.front=this.cap-1;
                this.rear=0;
            }
           else{
                front--;
            }
            this.arr[front]=n;
            System.out.println(Arrays.toString(this.arr));
        }

    }
    public void lenqueue(int n){
        if(front==rear&&front!=-1){
            System.out.println("overflow");
        }else{
            if(rear==-1){
                this.rear=0;
            }

            this.arr[rear]=n;
            rear++;
            System.out.println(Arrays.toString(this.arr));
        }

    }
    public void ldequeue(){
        if(front==-1){
            System.out.println("underflow");
        }else{
            if(front+1==rear){
                front=-1;
                rear=-1;
            }if(rear==0){
                rear=cap-1;

            }else{
                rear--;
            }
        }
    }
    public void fdequeue(){
        if(front==-1){
            System.out.println("underflow");
        }else{
            if(front+1==rear){
                front=-1;
                rear=-1;
            }if(front==cap-1){
                front=0;

            }else{
                front++;
            }
        }
    }
    public  void display(){
      if(rear<=front){
          System.out.println("hii");
          for(int i=this.front;i<this.cap;i++){
              System.out.println(this.arr[i]);
          }
          for(int j=0;j<this.rear;j++){
              System.out.println(this.arr[j]);
          }
      }else{
          System.out.println("hello");
          for(int i=front;i<this.rear;i++){
              System.out.println(this.arr[i]);
          }
      }

    }

    public static void main(String[] args) {
        Dqueue d=new Dqueue();
        d.fenqueue(10);
        d.fenqueue(11);
        d.fenqueue(12);
        d.lenqueue(13);
        d.lenqueue(14);
        d.lenqueue(15);
        d.fenqueue(16);
        d.fenqueue(17);
        d.fenqueue(18);
        d.fenqueue(19);
        d.fdequeue();
        d.ldequeue();
        d.fenqueue(2);
        d.fenqueue(3);
        d.fdequeue();
        d.fdequeue();
        d.fdequeue();
        d.fdequeue();
        d.fdequeue();
        d.fdequeue();
        d.fdequeue();
        d.display();


    }
}
