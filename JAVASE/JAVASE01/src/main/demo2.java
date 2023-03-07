package main;

public class demo2 {

    static class Student{

        String name;
        int year;
        Double score;
        String sex;
        public Student(){
            this("是",12,1231.1,"阿萨德");
            System.out.println("这是个不带参数的构造方法");
        }



        public Student(String name, int year, Double score, String sex) {
            this.name = name;
            this.year = year;
            this.score = score;
            this.sex = sex;
        }
    }
    public static void main(String[] args) {
        Student student =new Student();
    }
}
