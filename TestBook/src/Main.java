import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login(){
        System.out.println("请输入姓名");
        Scanner scanner =new Scanner(System.in);
        String name =scanner.nextLine();
        System.out.println("请输入你的身份:1管理员 0普通用户");
        int choice =scanner.nextInt();
        if(choice ==1){
            return new AdminUser(name);
        }else{
             return new NormalUser(name);
        }


    }

    public static void main(String[] args) {
         User user =login();
         while(true){
             int choice= user.menu();
             //选择1之后,调用的是User引用对象的具体操作,这个怎么做?
         }
    }
}
