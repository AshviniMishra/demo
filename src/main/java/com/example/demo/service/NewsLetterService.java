package com.example.demo.service;

import com.example.demo.dao.NewsLetterDao;
import com.example.demo.model.NewLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsLetterService {

    @Autowired
    private NewsLetterDao newsLetterDao;

    public ArrayList<NewLetter> getNewsLetters(ArrayList<String> categoryNames){
        return newsLetterDao.getNewsLetters(categoryNames);
    }
}
