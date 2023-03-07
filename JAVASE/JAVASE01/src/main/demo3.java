package main;

class  Cat {
     private String name;
     public int age;
     public String color;

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public   Cat(){
         this.name="秘密";
         this.color="黑色";
         this.age=12;
         System.out.println("不带参数的构造方法");
     }
     public Cat(String name, int age, String color) {
         this.name = name;
         this.age = age;
         this.color = color;
     }
     public void sleep(){
         System.out.println(this.name+"正在睡觉");

     }
     public void  eat(){
         System.out.println(this.name+"正在吃饭");

     }
     public void show(){
        System.out.println("名字:"+this.name+"年龄:"+this.age+"颜色:"+this.color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
public class demo3 {


    public static void main(String[] args) {
    Cat cat1 =new Cat("夏巧玲",99,"黑色");
    cat1.setName("奥利给");
    String name =cat1.getName();
        System.out.println(name );

        Cat cat2 =new Cat();
        System.out.println(cat1);

    }

}
