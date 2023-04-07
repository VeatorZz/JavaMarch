package Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

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
    //双指针
    private static int partition1(int[] array,int low,int high) {
        int prev = low ;
        int cur = low+1;
        while (cur <= high) {
            if(array[cur] < array[low] && array[++prev] != array[cur]) {
                swap(array,cur,prev);
            }
            cur++;
        }
        swap(array,prev,low);
        return prev;
    }
    //双指针
    private static int partition(int[] array, int left, int right) {
        int d = left + 1;
        int pivot = array[left];
        for (int i = left + 1; i <= right; i++) {
            if (array[i] < pivot) {
                swap(array, i, d);
                d++;
            }
        }
        swap(array, d - 1, left);
        return d - 1;
    }
    //Hoaro法
    public static int Hoarepartition(int[]array,int low,int high){
        int i=low;
        int tmp=array[low];
        while(low<high){
            while(low<high&&array[high]>=tmp){
                high--;
            }
            while(low<high&&array[low]<=tmp){
                low++;
            }
        }
        swap(array, low, high);
        return low;
    }
    //挖坑法
    public  final static void func(int asd ){

    }
    public static  int DigPartition(int[] array, int low, int high){
        int tmp=array[low];
            while(low<high){
                while(low<high && array[high]>=tmp){
                    high--;
                }
                array[low]=array[high];
                while(low<high && array[low]<=tmp){
                    low++;
                }
                array[high]=array[low];
            }
            array[low]=tmp;
            return low;

    }
    public static void insertSortRange(int[] array,int low,int end) {
        for(int i = low+1;i <= end;i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= low ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
    private static int medianOfThreeIndex(int[] array,int left,int right){
    int mid =left+(right-left)>>>1;
    if(array[left]<array[right]){
        if(array[right]<array[mid]){
            return right;
        }else if(array[mid]<array[left]){
            return left;
        }
        else{
            return mid;
        }
    }
    else{
        if(array[left]<array[mid]){
            return left;
        }else if(array[right]>array[mid]){
            return right;
        }else {
            return mid;
        }
    }

    }
    private static void quickNore(int[] array){
        Stack<Integer> stack =new Stack<>();
         int left =0;
         int right=array.length-1;
         int pivot=DigPartition(array, left, right);
         if(pivot>left+1){
             stack.push(left);
             stack.push(pivot-1);
         }
         if(pivot<right-1){
             stack.push(pivot+1);
             stack.push(right);
         }
         while(!stack.isEmpty()){
             right=stack.pop();
             left=stack.pop();
             pivot=DigPartition(array, left, right);
             if(pivot>left+1){
                 stack.push(left);
                 stack.push(pivot-1);
             }
             if(pivot<right-1){
                 stack.push(pivot+1);
                 stack.push(right);
             }
         }
    }
    public static void mergeSort(int[] array){

    }


    //分开
    private static void mergeSortInternal(int[]array,int low,int high){
        if(low>=high) return;
        int mid =low+(high-low)>>>1;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        merge(array,low,mid,high);
    }
    private static void merge(int[]array,int low,int mid,int high){
        int s1=low;
        int e1=mid;
        int s2=mid+1;
        int e2=high;
        int[] tmpArr=new int[high-low+1];
        int k =0;
        while(s1<=e1 &&s2<=e2){
            if(array[s1]<=array[s2]){
                tmpArr[k++]=array[s1++];
            }else{
                tmpArr[k++]=array[s2++];
            }
        }
        while(s1<=e1){
            tmpArr[k++]=array[s1++];
        }
        while(s2<=e2){
            tmpArr[k++]=array[s2++];
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=tmpArr[k++];
        }
    }
    public static void main(String[] args) {
        int[] array ={6,8,3,4,7,10,9,46,45};

        System.out.println("排序前"+ Arrays.toString(array));
        quickNore(array);
        System.out.println("排序后"+ Arrays.toString(array));

    }
}
