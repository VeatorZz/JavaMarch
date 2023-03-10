package operation;

import book.BookList;

public class AddOperation implements IOPeration  {
    @Override
    public void work(BookList bookList){
        System.out.println("新增图书!");
    }
}
