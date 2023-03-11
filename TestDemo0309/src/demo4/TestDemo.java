package demo4;

import javax.jws.Oneway;

class Money  implements Cloneable{
    public double money =19.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public  int id= 1234;
    public Money m =new Money();
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Person tmp=(Person) super.clone();
       this.m.clone();
       return  tmp;
    }


}
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {





//        Person person1 =new Person();
//        Person person2 =(Person ) person1.clone() ;
//        System.out.println(person1.m.money);
//        System.out.println(person2.m.money);
//        person2.m.money = 99.99;
//        System.out.println(person2.m.money);


    }
}
