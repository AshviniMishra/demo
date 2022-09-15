package com.example.demo.dao;

import com.example.demo.model.BookModel;
import com.example.demo.storage.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookDao {
    @Autowired
    SessionFactory sessionFactory;

    public List<BookModel> getBooks() {
        List<BookModel> bookModels = new ArrayList<>(10);
        bookModels.add((new BookModel("abc", 123)));
        bookModels.add((new BookModel("def", 124)));
        return bookModels;
    }

    public String addBooks(List<BookModel> books){
        Session session = sessionFactory.openSession();
        var storageBooks = books.stream().map(b -> new Book(b.getSerialNumber(), b.getName(), new Date()))
                .collect(Collectors.toList());
        storageBooks.forEach(book -> session.persist(book));
        return "Books entered";
    }
}
