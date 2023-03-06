package main;

import java.util.Arrays;


public class demo {
    public static String myToString(int[] array){
        return Arrays.toString(array);
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
