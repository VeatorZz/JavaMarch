package BinarySearchTree;

import java.util.*;

public class pratice {
    public List<String> topKFrequent(String[] words, int k) {
    PriorityQueue< >
    }
    public  static void func (String str1,String str2){
        Set<Character> set2 =new TreeSet<>();
        str2 =str2.toUpperCase();
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            set2.add(ch);
        }
        str1 =str1.toUpperCase();
        Set<Character> set3=new TreeSet<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch =str1.charAt(i);
            if(!set2.contains(ch) && !set3.contains(ch)){
              set3.add(ch);
            }
        }
        System.out.println(set3);



    }
    public static void mainnewke(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str1 =scanner.nextLine();
        String str2 =scanner.nextLine();
        func(str1,str2);
    }
    //771
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set =new TreeSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            char ch =jewels.charAt(i);
            set.add(ch);
        }
        int count =0;
        for (int i = 0; i < stones.length(); i++) {
            char ch =stones.charAt(i);
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}
