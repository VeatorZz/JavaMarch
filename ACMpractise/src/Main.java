
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m =input.nextInt();
        while(input.hasNext()){
           int n = input.nextInt();
            int sum =0;
            for (int i = 0; i < n; i++) {

                int ret =input.nextInt();
                sum +=ret;
            }
            System.out.println(sum);

        }

    }
}
