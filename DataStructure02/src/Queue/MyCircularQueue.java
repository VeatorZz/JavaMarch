package Queue;

public class MyCircularQueue {

private  int[] elem;
public  int front;
public  int rear;
        public MyCircularQueue(int k) {
         elem =new int[k];

        }

        public boolean enQueue(int value) {
            if(isFull())  return false;
            elem[rear]= value;
            rear++;
          return true;
        }

        public boolean deQueue() {
            if(isEmpty()) return  false;
            elem[front] =0;
            front++;
           return  true;
        }

        public int Front( ) {

         return elem[front];
        }

        public int Rear() {
         return elem[rear];
        }

        public boolean isEmpty() {
         if (rear ==front&&elem[rear]==0) return true;
         return  false;
        }

        public boolean isFull() {
          if((rear+1)%elem.length == front){
              return true;
          }
          return false;
        }

}
