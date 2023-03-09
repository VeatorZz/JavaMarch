
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
        Outerclass outerclass =new Outerclass();
        System.out.println(outerclass.data1);
        Outerclass.Innerclass innerclass =outerclass.new Innerclass();

    }
}
