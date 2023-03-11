package demo5;

import java.util.Objects;

class Student{
    String name;
    int age;
    public  Student(String name,int age){
        this.name =name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class demo {

    public static void main(String[] args) {
         Student student1 =new Student("limingyao",20);
         Student student2 =new Student("limingyao",19);
        System.out.println(student1.equals(student2));
    }
}
