package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Station {

    private String stationName;
    private Integer distance;

    public Station(String stationName, Integer distance) {
        this.stationName = stationName;
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}