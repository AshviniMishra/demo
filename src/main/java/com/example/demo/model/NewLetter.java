package com.example.demo.model;

public class NewLetter {

    private Integer id;
    private Integer categoryId;
    private String title;
    private Integer userId;
    private Integer price;

    public NewLetter(Integer id, Integer categoryId, String title, Integer userId, Integer price) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.userId = userId;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
