package main;

public class demo2 {

    static class Student{

        String name;
        int year;
        Double score;
        String sex;
        public  static  String classes;

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", year=" + year +",classes="+classes+
                    ", score=" + score +
                    ", sex='" + sex + '\'' +
                    '}';
        }

        public Student(String name, int year, Double score, String sex) {
            this.name = name;
            this.year = year;
            this.score = score;
            this.sex = sex;
        }
        {
            System.out.println("as看见好多发卡上");
        }
    }
    static class TestDemo{

        public   void func3(){

        }
    }
    public static void main(String[] args) {
     TestDemo testDemo =new TestDemo();
         testDemo.func3();

        Student student =new Student("lisi",12,123.0,"NAN");
        //通过类名来访问
      Student.classes ="104Java";
        System.out.println(student);
    }
}
