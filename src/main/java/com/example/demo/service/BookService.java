package com.example.demo.service;

import com.example.demo.dao.BookDao;
import com.example.demo.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    public List<BookModel> getBooks(){
        return bookDao.getBooks();
    }

    public String addBooks(List<BookModel> books){
        return bookDao.addBooks(books);
    }
}
