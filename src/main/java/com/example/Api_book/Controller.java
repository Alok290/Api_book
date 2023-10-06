package com.example.Api_book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {


    @Autowired
    Service ServiceObj;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        ServiceObj.addBook(book);
        return "Success";
    }
    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody Author author)
    {
        ServiceObj.addAuthor(author);
        return "Success";
    }

    @GetMapping("/getBookHighNoPages")

    public String getBookHighestNo(){

        return ServiceObj.getBookHigh();
    }

    @PutMapping("/updatePages")

    public void updatePages(@RequestParam String bookName,@RequestParam Integer no)
    {
        ServiceObj.getUpdate(bookName,no);
    }
}
