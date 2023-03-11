package demo1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import demo2.Testdemo;

class Animals{
    public String name;
    public int age;


    public void eat(){
        System.out.println(this.name+"干了兄弟们!");
    }
}
 class Cat extends Animals{

     public Cat(String name, int age) {
         super.name = name;
         super.age = age;
     }
     public  void eat(){
         System.out.println(this.name+"奥利给1");
     }

}
interface IFlying{
   void  fly();
}
interface IRunning{
    void run();
}
interface   ISwimming{
    void swimming();
}
class Dog extends  Animals implements IFlying,IRunning,ISwimming{
    public Dog(String name){
        super.name=name;

    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }

    @Override
    public void swimming() {

    }
}
public class test extends Testdemo {

    public static void main(String[] args) {
       Animals animals=new Cat("奥利给",12);
       animals.eat();
    }
}
