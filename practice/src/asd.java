import java.util.Scanner;
public class asd {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int f =scanner.nextInt();
        System.out.println("第一题:"+f1(f));
        System.out.println("第二题:"+f2(f));

    }
    public static int f1(int n ){
        if(n==1){
            return 1;
        }
            return n*f1(n-1);
        }

    public static int f2(int n){

        if(n==0){
            return 0;
        }
        return f1(n)+f2(n-1);
    }

}
