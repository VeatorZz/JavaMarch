class Myarray<T>{
    public T[] array = (T[]) new Object[10];
    public T getPos(int pos){
         return this.array[pos];
    }
    public Void setPos(int pos, T val){

        this.array[pos]=  val;
        return null;
    }
}
public class demo1  {
    public static void main(String[] args) {
     Myarray<Integer> myarray =new Myarray();
     myarray.setPos(0,1);
     myarray.setPos(1,2);
     Integer ret =myarray.getPos(0);
        System.out.println(ret);
        System.out.println(myarray.getPos(1));

        Myarray<String> myarray2 =new Myarray<String>();
    }
}
