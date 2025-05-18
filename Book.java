import java.util.Date;
class book {
public int sNo;
public String bookName;
public String authorName;
public int bookQty;
public int bookQtyCopy;
public Date checkOutDate;
public Date checkInDate;
public book(int sNo, String bookName, String authorName, int bookQty) {
this.sNo = sNo;
this.bookName = bookName;
this.authorName = authorName;
this.bookQty = bookQty;
this.bookQtyCopy = bookQty;
}
}
