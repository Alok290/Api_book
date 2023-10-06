package com.example.Api_book;


import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repoObj;

    public  void  addBook(Book book){
        repoObj.addBookToDb(book);
    }

    public  void  addAuthor(Author author){
        repoObj.addAuthorToDb(author);
    }

    public String getBookHigh(){

        return repoObj.getBookHigh();
    }

    public void getUpdate(String bookName,Integer no){
        repoObj.getUpdate(bookName,no);
    }

}
