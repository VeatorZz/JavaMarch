package operation;

import book.BookList;

public class ReturnOperation implements IOPeration {
    public void work(BookList bookList){
        System.out.println("归还图书");
    }
}
