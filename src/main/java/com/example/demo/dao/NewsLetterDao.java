package com.example.demo.dao;

import com.example.demo.model.NewLetter;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class NewsLetterDao {

    @Autowired
    SessionFactory sessionFactory;

    public ArrayList<NewLetter> getNewsLetters(ArrayList<String> categoryNames){

        Session session = sessionFactory.openSession();

        ArrayList<NewLetter> list = new ArrayList<>();

       Query query = session.createQuery("from N")

        return list;
    }

    public void addNewsLetter(){

        ArrayList<com.example.demo.dao.NewLetter> newLetters = new ArrayList<>();

        newLetters.add(new com.example.demo.dao.NewLetter(123, 45, "Science", 1, 100));
        newLetters.add(new com.example.demo.dao.NewLetter(124, 46, "Technology", 1, 120));

        Session session = sessionFactory.openSession();

        Iterator<com.example.demo.dao.NewLetter> it = newLetters.iterator();

        while (it.hasNext()){
            com.example.demo.dao.NewLetter letter = it.next();
            session.persist(letter);
        }

    }
}
