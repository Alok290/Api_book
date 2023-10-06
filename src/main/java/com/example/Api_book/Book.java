package com.example.Api_book;

public class Book {

    private String  bookName;

    private int noOfPages;
    private String author;

    public Book(String bookName, int noOfPages,String author) {
        this.bookName = bookName;
        this.noOfPages = noOfPages;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
