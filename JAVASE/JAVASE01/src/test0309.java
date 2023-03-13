
class Outerclass{
    public  int data1 =10;
    private  int data2 =20;
    public static  int data3 =30;

    class Innerclass{
        public  int data =410;
        private  int data5=500;
        public  int data6=60;
        Innerclass(){
            System.out.println("Innerclass");
        }
        public void method(){
            System.out.println("innerclass的method方法! ");
        }
    }
}
public class test0309 {


    public static void main(String[] args) {
        int[]array={1,2,3,4};
        try{
            System.out.println(array[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("捕获到了一个异常");
        }
    }
}
