package book;

public class BookList {

    private Book[] books=new Book[12];
    private int usedSize;//数组中放了几本书
    public BookList(){
        books [0]=new Book("三国演义","罗贯中",90,"小说");
        books [1]=new Book("吴承恩","吴承恩",60,"小说");
        books [2]=new Book("红楼梦","曹雪芹",15,"小说");
        this.usedSize = 3;

    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    public Book getPos(int pos){
        return books[pos];
    }

    public void setBooks(int pos,Book book){
        books[pos]=book;
    }
}

