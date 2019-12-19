package HomeWork.day43;

public class Books {

    private String bookName;
    private String writer;
    private String type;
    private int pageNumber;
    private int price;

    public String getBookName() {
        return bookName;

    }

    public void setBookName(String bookName) {
        this.bookName = bookName;

    }

    public String getWriter(String writer) {
        return writer;

    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getType(String type) {
        return type;

    }

    public void setType(String type) {
        this.type = type;

    }

    public int getPageNumber(int pageNumber) {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int price() {
        return 30;
    }
}
class ChildrenBook extends Books{
        public int price(){
            return super.price() + 10;
        }


}

class Comics extends Books {
        public int price(){
            return super.price() - 15;
        }
    }

