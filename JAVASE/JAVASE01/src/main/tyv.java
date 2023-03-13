package main;

public class tyv {
    public static void main(String[] args) {
        int[] array ={1,2,3,4};  
        try{
            System.out.println(array[9]);
        }catch(Exception e) {


        }
        catch(NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界异常");
            e.printStackTrace();
        }
        System.out.println("哈哈");
    }
}
