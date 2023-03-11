class Student {
    public static String name = "asd ";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }
}
public class demo {


    public static void main(String[] args) {
        Student student1 =new Student();
        System.out.println(student1.name);
        student1.setName("pingjiale");
        System.out.println(student1.name);
        }

    }
