package TestHeap;

public class Test {
    public static void main(String[] args) {
        TestHeap testHeap =new TestHeap();
        int[] array={27,15,19,18,34,65,49,25,37,28};
        testHeap.createHeap(array);
        System.out.println();
        for (int i = 0; i < testHeap.elem.length; i++) {
            System.out.println(testHeap.elem[i]);
        }

    }
}
