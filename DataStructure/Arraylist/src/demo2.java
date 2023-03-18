import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> arraysList =new ArrayList<>();
        arraysList.add(0,1);
        arraysList.add(1,2);
        arraysList.add(2,199);
        arraysList.add(3,299);
        arraysList.add(4,399);
        arraysList.add(5,499);
        System.out.println(arraysList);
        List<Integer> list = arraysList.subList(1,3);
        System.out.println(list);
    }
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ret =new ArrayList<>();
            List<Integer> one =new ArrayList<>();
            one.add(1);
            ret.add(one);
            for (int i = 1; i <numRows ; i++) {
                List<Integer> curRows =new ArrayList<>();
                curRows.add(1);
                for (int j = 1; j < i; j++) {
                  List<Integer>  PreRow =ret.get(i-1);
                  int x = PreRow.get(j)+PreRow.get(j-1);
                  curRows.add(x);
                  
            }
                curRows.add(1);
                ret.add(curRows);
            }
            return ret;

        }
    }
}
