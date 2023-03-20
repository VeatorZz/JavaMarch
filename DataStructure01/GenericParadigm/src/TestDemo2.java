class  Alg<T extends  Comparable<T>>{
    public T findMax(T[] array){
   T max =array[0];
        for (int i = 1; i < array.length; i++) {
            if(max.compareTo(array[i]) < 0){
                max =array[i];
            }

        }
        return  max;
    }
}
 class Student implements Comparable<Student> {
    public String Name;
    public Integer age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge(int i) {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name, Integer age) {
        Name = name;
        this.age = age;
    }


   @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Alg2{
    public static<T extends Comparable<T>> T findmax(T[] array){
        T max =array[0];
        for (int i = 1; i < array.length; i++) {
            if(max.compareTo(array[i]) < 0){
                max =array[i];
            }

        }
        return  max;
    }
    }



public class TestDemo2 {
    public static void main(String[] args) {
        Integer[] array ={1,4,5,21,7,8};
        Integer max =Alg2.findmax(array);

    }

    public  static void main2(String[] args) {
        Alg<Integer> alg = new Alg<>();
        Integer[] array = {1, 4, 5, 21, 8, 19};
        System.out.println(alg.findMax(array));
        Alg<Student> alg2 = new Alg<>();
        Student[] students = new Student[3];
        students[0] = new Student("abc", 15);
        students[0] = new Student("abc", 15);
        students[1] = new Student("cdf", 25);
        students[2] = new Student("efd", 35);

        Student student1 = new Student("asd", 20);

        alg2.findMax(students);
    }

}
