package com.example.demo.storage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table
public class Book {

    public Book(int serialNumber, String name, Date issueDate) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.issueDate = issueDate;
    }

    @Id
    private int serialNumber;

    @Column
    private String name;

    @Column
    private Date issueDate;
}
