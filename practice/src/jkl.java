import java.util.Scanner;

public class jkl {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            String ret = func(str);
            System.out.println(ret);
        }

    }

    private static String func(String str) {
        int []array =new int[127];
        StringBuffer stringBuffer =new StringBuffer(str);
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if(array[ch]==0){
                stringBuffer.append(ch);
                array[ch] = 1;
            }

        }

        return stringBuffer.toString();
    }
}
