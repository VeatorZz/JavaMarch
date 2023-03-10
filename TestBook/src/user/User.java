package user;

public abstract class User {
    protected String name;
    //..可以罗列更多的属性
    public User(String name){
        this.name =name;
    }

     public abstract int menu() ;//发生重写了,不用这个menu所以用抽象类
}
