package second;

import java.util.*;
public class Main {
    public static void main(String[] args) {

    }
    public static void main1084(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while ((t--) != 0) {
            int n = scanner.nextInt();
            int a[][]=new int [n+2][n+2];
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=i; j++) {
                    a[i][j]=scanner.nextInt();
                }
            }
            for (int i = n-1 ; i>=1; i--) {
                for (int j = 1; j <=i; j++) {
                    a[i][j]+=Math.max(a[i+1][j+1], a[i+1][j]);

                }
            }
            System.out.println(a[1][1]);


        }
    }
}
//}
//    public static void main1018(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        while (scanner.hasNext()){
//            int A =scanner.nextInt();
//            int B =scanner.nextInt();
//            int n =scanner.nextInt();
//            if( A==0&&B==0 &&n==0){
//                break;
//            } else{
//                int[] num =new int[49];
//                num[1]=num[2]=1;
//                for (int i = 3; i < 49; i++) {
//                    num[i]=(A*num[i-1]+B*num[i-2])%7;
//                }
//                int sum =n%48;
//                System.out.println(num[sum]);
//            }
//
//        }
//    }
//    //1019
//    static int gcd(int a, int b) {
//        if (b == 0) return a;
//        else return gcd(b, a % b);
//    }
//
//    static int lcm(int a, int b) {
//        long tmp = (long) a * b;
//        int x = gcd(a, b);
//        tmp /= x;
//        return (int) tmp;
//    }
//    public static void main1019(String[] args) {
//        int t = 0;
//        Scanner scanner = new Scanner(System.in);
//        t = scanner.nextInt();//这个多组输入及标记一下,以后用这个
//        while (t != 0) {
//            --t;
//            int m = scanner.nextInt();
//            int ans = scanner.nextInt();
//            int b = 0;
//            for (int i = 1; i < m; ++i) {
//                b = scanner.nextInt();//比大小时这是个新思路
//                ans = lcm(ans, b);
//            }
//            System.out.println(ans);
//        }
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//     public static void main1096(String args[]){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//            while(n>0){
//                int sum = 0;
//                int m = sc.nextInt();
//                for(int i=1;i<=m;i++){
//                    int a = sc.nextInt();
//                    sum = sum + a;
//                }
//                n--;
//                System.out.println(sum);
//                if(n!=0)
//                    System.out.println();
//            }
//        }
//    }
//
//    public static void main1008(String[] args)
//        {
//            int n =0;
//            int time =0;
//            Scanner scanner=new Scanner(System.in);
//            while(scanner.hasNext()){
//                 n =scanner.nextInt();
//                if(n==0){
//                    break;
//                }
//                int tmp = 0;
//                time=0;
//                int array[]=new int[n];
//                for (int i = 0; i < n; i++) {
//                     array[i]=scanner.nextInt();
//                }
//                for (int i = 0; i < n; i++) {
//                    if(array[i]>=tmp){
//                        time +=(array[i] - tmp)*6;
//                    }
//                    else {
//                        time +=(tmp-array[i])*4;
//                    }
//                    tmp = array[i];
//                }
//                System.out.println(time + n * 5);
//            }
//        }
//    }
//
