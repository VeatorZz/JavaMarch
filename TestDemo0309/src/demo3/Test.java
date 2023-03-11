package demo3;

import java.util.Arrays;
import java.util.Comparator;



class Student implements  Comparable<Student> {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.name.compareTo(o1.name);
    }
}

public class Test {
    public static void main(String[] args) {
    Student[] students =new Student[3];
    students[0]=new Student("张三",12,90);
    students[1]=new Student("李四",15,70);
    students[2]=new Student("王五",16,60);
    AgeComparator ageComparator =new AgeComparator();
    Arrays.sort(students,ageComparator);
        System.out.println(Arrays.toString(students));
    NameComparator nameComparator =new NameComparator();
        System.out.println(Arrays.toString(students));
    Arrays.sort(students,nameComparator);
    if (students[0].compareTo(students[1])<0){
        System.out.println("askfg");}
    }


    
    }

