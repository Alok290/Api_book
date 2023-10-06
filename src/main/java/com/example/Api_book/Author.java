package com.example.Api_book;

public class Author {

    private String authorName;
     private int totalNoOfPages;

    public Author(String authorName, int totalNoOfPages) {
        this.authorName = authorName;
        this.totalNoOfPages = totalNoOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getTotalNoOfPages() {
        return totalNoOfPages;
    }

    public void setTotalNoOfPages(int totalNoOfPages) {
        this.totalNoOfPages = totalNoOfPages;
    }
}
