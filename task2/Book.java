package tasks.task2;

import  java.util.ArrayList;

public class Book {
    private String authorName;
    private String bookName;
    private String dateOfWriting;
    private int numOfPages;

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setDateOfWriting(String dateOfWriting) {
        this.dateOfWriting = dateOfWriting;
    }
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }
    public String getBookName() {
        return bookName;
    }
    public String getDateOfWriting() {
        return dateOfWriting;
    }
    public int getNumOfPages() {
        return numOfPages;
    }

    public ArrayList<String> getData() {
        ArrayList<String> dataList = new ArrayList<String>();
        dataList.add(authorName);
        dataList.add(bookName);
        dataList.add(dateOfWriting);
        dataList.add(Integer.toString(numOfPages));

        return dataList;
    }
}

class BookTest {
    public static void main(String[] args) {
        Book newBook = new Book();
        newBook.setAuthorName("Dostoevskiy");
        newBook.setBookName("Besy");
        newBook.setDateOfWriting("1872");
        newBook.setNumOfPages(704);

        System.out.println(newBook.getData());
    }
}