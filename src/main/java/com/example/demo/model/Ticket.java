package com.example.demo.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Ticket {

    private String sourceStation;
    private String destinationStation;
    private Integer price;
    private Integer distance;
    private Date issueTime;

    public Ticket(String sourceStation, String destinationStation, Integer price, Integer distance, Date issueTime) {
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.price = price;
        this.distance = distance;
        this.issueTime = issueTime;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "sourceStation='" + sourceStation + '\'' +
                ", destinationStation='" + destinationStation + '\'' +
                ", price=" + price +
                ", distance=" + distance +
                ", issueTime=" + issueTime +
                '}';
    }
}
