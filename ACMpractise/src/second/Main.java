package second;

import java.util.*;
public class Main {


    //1019
    static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        long tmp = (long) a * b;
        int x = gcd(a, b);
        tmp /= x;
        return (int) tmp;
    }


    
    //1019
    public static void main(String[] args) {
        int t = 0;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();//这个多组输入及标记一下,以后用这个
        while (t != 0) {
            --t;
            int m = scanner.nextInt();
            int ans = scanner.nextInt();
            int b = 0;
            for (int i = 1; i < m; ++i) {
                b = scanner.nextInt();//比大小时这是个新思路
                ans = lcm(ans, b);
            }
            System.out.println(ans);
        }

    }











     public static void main1096(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            while(n>0){
                int sum = 0;
                int m = sc.nextInt();
                for(int i=1;i<=m;i++){
                    int a = sc.nextInt();
                    sum = sum + a;
                }
                n--;
                System.out.println(sum);
                if(n!=0)
                    System.out.println();
            }
        }
    }

    public static void main1008(String[] args)
        {
            int n =0;
            int time =0;
            Scanner scanner=new Scanner(System.in);
            while(scanner.hasNext()){
                 n =scanner.nextInt();
                if(n==0){
                    break;
                }
                int tmp = 0;
                time=0;
                int array[]=new int[n];
                for (int i = 0; i < n; i++) {
                     array[i]=scanner.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    if(array[i]>=tmp){
                        time +=(array[i] - tmp)*6;
                    }
                    else {
                        time +=(tmp-array[i])*4;
                    }
                    tmp = array[i];
                }
                System.out.println(time + n * 5);
            }
        }
    }

