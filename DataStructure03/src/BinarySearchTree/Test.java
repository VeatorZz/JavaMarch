package BinarySearchTree;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("hello",3);
        map.put("abcd",4);
        map.put("bit", 10);
        System.out.println(map);
        BinarySearchTree binarySearchTree =new BinarySearchTree();
        int[] array={10,4,29,35,18,27,5,13};
        for (int i = 0; i < array.length; i++) {
            binarySearchTree.insert(array[i]);
        }

     BinarySearchTree.TreeNode  ret =binarySearchTree.search(18);
        try{
            System.out.println(ret.key);
        }catch (NullPointerException e ){
            System.out.println("没有你要找的节点");
            e.printStackTrace();
        }
      binarySearchTree.remove(10);
        System.out.println("测试");
    }
}
