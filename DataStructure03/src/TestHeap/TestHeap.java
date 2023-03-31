package TestHeap;

public class TestHeap {
    public int[] elem;
    public  int usedSize;

    public  TestHeap() {
        this.elem=new int[10];
    }
    public void createHeap(int[]array){
        for (int i = 0; i < array.length; i++) {
            elem[i]=array[i];
            usedSize++;
        }
        for (int p = (usedSize-1-1)/2; p >=0 ; p--) {
            shiftDown(p,elem.length);
        }
    }

    private void shiftDown(int root,int len) {
   int parent =root;
   int child =2*parent+1;
   while(child<len){
       if(child+1<len&&elem[child]<elem[child+1]){
           child++;
       }
       if(elem[child]>elem[parent]){
           int tmp =elem[child];
           elem[child]=elem[parent];
           elem[parent]=tmp;
           parent=child;
           child=parent*2+1;
       }else{
           break;
       }
   }
    }

}
