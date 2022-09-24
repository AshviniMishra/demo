package com.example.demo.dao;

import jakarta.persistence.*;

@Entity
@Table
public class NewLetter {

    @Id
    private Integer id;

    //@OneToOne
    //@JoinColumn(name = "id", referencedColumnName = "category_id")
    private Integer category_id;

    @Column
    private String title;

    //@ManyToOne
    //@JoinColumn(name = "id", referencedColumnName = "user_id")
    private Integer user_id;

    @Column
    private Integer price;

    public NewLetter(Integer id, Integer category_id, String title, Integer user_id, Integer price) {
        this.id = id;
        this.category_id = category_id;
        this.title = title;
        this.user_id = user_id;
        this.price = price;
    }
}
