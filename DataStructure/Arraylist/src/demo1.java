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
                System.out.print(this.elem[i]+" ");

            }
           System.out.println();
        }
        public boolean contains(int toFind){
            for (int i = 0; i < this.UseSize; i++) {
                if(this.elem[i]==toFind){
                    return true;
                }
            }
            return false;
        }
        public  int indexOf(int toFind) {
            if (!contains(toFind)) {
                System.out.println("没有你找的东西");
            }
            for (int i = 0; i < this.UseSize; i++) {
                if (this.elem[i] == toFind) {
                    return i;
                }
            }
            return -1;
        }
        public  int get(int pos){
           if(!checkPosInAdd(pos)){
               throw  new MyarrayListIndexOfException("pos不合法");
           }
           return this.elem[pos];
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

        public boolean checkPosInAdd(int pos){
           if(pos<0 || pos>this.UseSize){
               System.out.println("pos位置不合法");
               return false;
           }
           return true;//合法
       }
        public  void add(int pos ,int data){
           if(!checkPosInAdd(pos)){
               throw  new MyarrayListIndexOfException("添加方法的pos不合理");
           }
//           if(pos<0 || pos>this.UseSize){
//               System.out.println("整不了一点");
//               return;
//           }
            if(isFull()){
                this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
            }
//            int tmp = this.UseSize-1;
//            for (int i = 0; i < this.UseSize-pos; i++) {
//                this.elem[tmp] = this.elem[tmp-1];
//                tmp--;
//            }
//            this.elem[tmp]= data;
            for (int i = this.UseSize-1; i >=pos ; i--) {
                this.elem[i+1]=this.elem[i];
            }
            this.elem[pos]=data;
            this.UseSize++;


        }

        public void set(int pos,int value){
           if (!checkPosInAdd(pos)){
             throw new MyarrayListIndexOfException("pos不合法");
           }
           this.elem[pos]=value;
        }
    }



    public static void main(String[] args) {
        MyArrayList arrayList =new MyArrayList();
        arrayList.add(0,1);
        arrayList.add(1,1);
        arrayList.add(2,1);
        arrayList.add(3,1);
        arrayList.add(4,1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.display();
        arrayList.set(3,99);
        arrayList.display();

    }
}
