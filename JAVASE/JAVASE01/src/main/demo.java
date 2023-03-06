package main;

import java.util.Arrays;


public class demo {
    public static String myToString(int[] array){
        return Arrays.toString(array);
    }
    public static void main(String[] args) {
        int[] array1={1,2,3,4};
      String abc = myToString(array1);
        System.out.println(abc);
    }
}
