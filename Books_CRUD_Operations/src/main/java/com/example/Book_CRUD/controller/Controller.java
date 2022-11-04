package com.example.Book_CRUD.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Book_CRUD.Books;

@RestController
public class Controller {

    @Autowired
    Books b;

    // Get all books
    @GetMapping("/books")
    public List<String> allBook(){       
        return b.allBook();
    }

    // Get a specific by name
    @GetMapping("/get/{bookName}")
    public String handle(@PathVariable("bookName") String bookName){        
        return b.getBookByName(bookName);
    }

    // Get specific book by bookIndex
    @GetMapping("/getid/{bookIndex}")
    public String handle(@PathVariable("bookIndex") int bookIndex){        
        return b.getBookByIdx(bookIndex);
    }    

    // add new book by name
    @PostMapping("/add")
    public String create(@RequestBody String bookName){
        return b.addBook(bookName);
    }

    // Delete one book by bookIndex
    @DeleteMapping("/delete/{deleteIndex}")
    public String delete(@PathVariable("deleteIndex") int deleteIndex){
        return b.delete(deleteIndex);
    }

    // Update a specific book by bookIndex and bookName
    @PutMapping("/update/{bookIndex}")
    public String update(@RequestBody String newBook, @PathVariable int bookIndex){
        return b.update(newBook,bookIndex);
    }
}
