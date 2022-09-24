package com.example.demo.controller;


import com.example.demo.model.NewLetter;
import com.example.demo.service.NewsLetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NewsLetterController {

    @Autowired
    private NewsLetterService newsLetterService;

    @GetMapping("/newsLetter")
    public ArrayList<NewLetter> getNewsLetters(ArrayList<String> categoryNames){
        return newsLetterService.getNewsLetters(categoryNames);
    }
}
