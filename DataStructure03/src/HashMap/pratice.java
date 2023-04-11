package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class pratice {
    public static void main(String[] args) {
        int[] array =new int[10_0000];
        Random random =new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(10_0000);
        }
        HashMap<Integer,Integer> map=func3(array);
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println("key "+entry.getKey()+"val "+entry.getValue());
        }
    }
    public static  HashMap<Integer, Integer> func3(int[] array){
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int i = 0; i < array.length; i++) {
           if(hashMap.get(array[i])==null){
               hashMap.put(array[i],1);
           }else{
               int val = hashMap.get(array[i]);
               hashMap.put(array[i],val+1);
           }
        }
        return hashMap;
    }
}
