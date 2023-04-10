package BinarySearchTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> s =new TreeSet<>();
        s.add("hello");
        s.add("hello");
        s.add("abcd");
        System.out.println(s );
    }
    public static void main2(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("hello",3);
        map.put("abcd",4);
        map.put("bit", 10);
     //   System.out.println(map);
        Integer ret =map.getOrDefault("hello1",100);
        System.out.println(ret);
        Set<Map.Entry<String, Integer>> entrySet =map.entrySet();
        for (Map.Entry<String,Integer> entry: entrySet){
            System.out.println("key:"+entry.getKey()+"val:"+entry.getValue());
        }

//        BinarySearchTree binarySearchTree =new BinarySearchTree();
//        int[] array={10,4,29,35,18,27,5,13};
//        for (int i = 0; i < array.length; i++) {
//            binarySearchTree.insert(array[i]);
//        }
//
//     BinarySearchTree.TreeNode  ret =binarySearchTree.search(18);
//        try{
//            System.out.println(ret.key);
//        }catch (NullPointerException e ){
//            System.out.println("没有你要找的节点");
//            e.printStackTrace();
//        }
//      binarySearchTree.remove(10);
//        System.out.println("测试");
    }
}
