package operation;

import book.BookList;

public class ExitOperation implements IOPeration {
    public void work(BookList bookList){
        //因为需要销毁这个数组当中的所有的数据
        System.out.println("奥力给");
    }
}
