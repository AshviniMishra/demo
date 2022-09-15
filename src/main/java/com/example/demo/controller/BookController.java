package com.example.demo.controller;

import com.example.demo.model.BookModel;
import com.example.demo.service.BookService;
import com.example.demo.storage.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/books")
    List<BookModel> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping("/books")
    String addBooks(@RequestBody List<BookModel> books){
        return bookService.addBooks(books);
    }
}
