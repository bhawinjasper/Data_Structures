public class Stack {
     int cap;
     int top;
     int arr[];
      Stack(){
          this.cap=10;
          this.arr=new int[cap];
          this.top=-1;
      }
 public void push(int n){
    if(top==this.cap-1) {
        this.cap*=2;
        int temp[]=this.arr;
        this.arr=new int[this.cap];
        for (int i=0;i<temp.length;i++){

            this.arr[i]=temp[i];
;
        }
        top++;
        this.arr[top] = n;
    }


    else {
        top++;
        this.arr[top] = n;

    }
 }
  public void pop(int n){
    if(this.top==-1){
        System.out.println("underflow");
    }else {

        int x = arr[top];
        top--;

    }
  }
   public  void display(){
          for(int i=this.top;i>=0;i--){
              System.out.println(arr[i]);
          }
   }
    public static void main(String[] args) {
          Stack st=new Stack();
          st.push(10);
          st.push(12);
          st.push(13);
          st.push(14);
          st.push(15);
          st.push(16);
          st.push(17);
          st.push(18);
          st.push(19);
          st.push(20);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);
          st.push(21);

          st.display();

    }

}
