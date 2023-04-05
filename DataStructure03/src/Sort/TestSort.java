package Sort;

import java.util.Arrays;

public class TestSort {
    public static void shell(int[]array,int gap){
        for (int i = gap; i < array.length ; i++) {
            int tmp =array[i];
            int j =i-gap;
            for (; j>=0; j-=gap) {
                if(array[j]>tmp){
                    array[j+gap]=array[j];
                }else{
                    break;
                }
                array[j+gap]=tmp;
            }
        }
    }public static void shellSort(int[] array){
        int gap = array.length;
        while(gap>1){
            shell(array,gap);
            gap/=2;
        }
        shell(array,1);

    }
    public static void shellSort1(int[] array){
        int i = 0;
        int gap =array.length;
        while(gap!=1){
            gap=gap/3+1;
            int j =0;
            for (int l = gap; l < array.length; l++) {
                if(array[j]>array[l]){
                    int tmp =array[j];
                    array[j]=array[l];
                    array[l]=tmp;
                }
                j++;
            }
            
        }

    }
    public static void insertSort(int[] array){
        for (int i = 1; i < array.length ; i++) {
            int tmp =array[i];
            int j =i-1;
            for (; j>=0; j--) {
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }array[j+1]=tmp;
        }
    }
    public static void swap(int[]array,int low,int high){
        int tmp =array[low];
        array[low]= array[high];
        array[high]=tmp;
    }
    public static int  heapSort(int[] array,int low,int high){
        int i =low;
        int tmp =array[low];
        while(low<high){
            while(low<high&&tmp<=high){
                high--;
            }
            while(low<high && tmp>=low){
                low++;
            }
            swap(array,low,high);
        }
        array[low]=tmp;
        return low;
        
    }
    public static void main(String[] args) {
        int[] array ={5,10,3,8,2};
        System.out.println("排序前"+ Arrays.toString(array));
        insertSort(array);
        System.out.println("排序后"+ Arrays.toString(array));

    }
}
