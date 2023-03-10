package user;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
    }
    public int menu(){
        System.out.println("hello"+"欢迎来到图书管理系统!");
        System.out.println("1.查找图书");
        System.out.println("1.查找图书");
        System.out.println("1.查找图书");
        System.out.println("1.查找图书");
        System.out.println("1.查找图书");
        System.out.println("1.查找图书");
        System.out.println("请输入你的操作");
        Scanner scanner =new Scanner(System.in);
        int  choice =scanner.nextInt();
        return choice;

    }
}
