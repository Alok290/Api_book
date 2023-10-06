package com.example.Api_book;


import java.util.HashMap;

@org.springframework.stereotype.Repository
public class Repository {

    HashMap<String, Book> BookDb = new HashMap<>();

    HashMap<String, Author> AuthorDb = new HashMap<>();

    public void addBookToDb(Book book){
        String bookName = book.getBookName();
        BookDb.put(bookName,book);
    }
    public void addAuthorToDb(Author author){
        String authorName = author.getAuthorName();
        AuthorDb.put(authorName,author);
    }

    public String getBookHigh (){
        int min =0;
        String ans = "";
        for(Book book: BookDb.values()){
            int noOfPages = book.getNoOfPages();
            if(noOfPages>min)
            {
                ans = book.getBookName();
            }
        }
        return ans;
    }

    public void getUpdate(String BookName, Integer no){
        String authorName = "";
        int ans =0;
        for(Book book : BookDb.values()){
            if(book.getBookName().equals(BookName))
            {
                authorName = book.getAuthor();
                 ans = book.getNoOfPages()+no;
                book.setNoOfPages(ans);
            }
        }
        for(Author author: AuthorDb.values()){

            if(author.getAuthorName().equals(authorName)){
                author.setTotalNoOfPages(ans);
            }

        }
    }
}
