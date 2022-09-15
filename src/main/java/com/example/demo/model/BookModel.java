package com.example.demo.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BookModel {
    private String name;
    private int serialNumber;

    public BookModel(){}

    public BookModel(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookModel bookModel = (BookModel) o;
        return Objects.equals(name, bookModel.name) && Objects.equals(serialNumber, bookModel.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serialNumber);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
