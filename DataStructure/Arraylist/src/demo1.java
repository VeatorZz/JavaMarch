import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;

public class demo1 {
   public static class MyArrayList{
        public int[] elem;
        public int UseSize;
        private static  final  int DEFAULT_SIZE=10;

       public MyArrayList() {
           this.elem = new int[DEFAULT_SIZE];
       }

       public void display(){
            for (int i = 0; i < this.UseSize; i++) {
                System.out.println(this.elem[i]+" ");
                System.out.println();
            }
        }


        public boolean isFull(){
            return this.UseSize == this.elem.length;
        }


        public void add(int data){
            if(isFull()){
                this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
            }
            this.elem[this.UseSize]= data;
            UseSize++;
        }
    }



    public static void main(String[] args) {
        MyArrayList arrayList =new MyArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.display();

    }
}
