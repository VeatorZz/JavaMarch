package main;

import java.util.Arrays;



public class demo {
    public static String myToString(int[] array){
        return Arrays.toString(array);
    }
    public static void bubbleSort(int[]array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flg =false;
            for (int j = 0; j < array.length-1-i; j++) {
               if(array[j]>array[j+1]){
                   int tmp =array[j];
                   array[j]=array[j+1];
                   array[j+1]=tmp;
                   flg =true;
               }
            }
            if(flg ==false){
                break;
            }
        }

    }
    public static  int BinarySearch(int []array,int key){
        int left  =0;
        int right =array.length-1;
        while(left<=right){
            int mid =(left+right)/2;
            if(array[mid]== key){
                return mid;
            }else if(array[mid]<key){
                left=mid+1 ;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public  static  Double avg(int[]array){
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum+=sum+array[i];

        }
        return sum*1.0/array.length;
    }
    public static void main(String[] args) {
        int[] array1={1,2,3,4};
        int[] copy=new int[array1.length];
        for (int i = 0; i < array1.length-1; i++) {
            copy[i]=array1[i];
        }
        Arrays.copyOf(array1,array1.length);



        System.out.println(copy);
    }
}
