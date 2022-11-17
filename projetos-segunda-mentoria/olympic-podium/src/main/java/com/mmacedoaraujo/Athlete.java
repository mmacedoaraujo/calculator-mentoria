package com.mmacedoaraujo;

import java.util.Collection;

public class Athlete {

    private String name;
    private String country;
    private Integer throwDistance;

    public Athlete() {
    }

    public Athlete(String name, String country, Integer throwDistance) {
        this.name = name;
        this.country = country;
        this.throwDistance = throwDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getThrowDistance() {
        return throwDistance;
    }

    public void setThrowDistance(Integer throwDistance) {
        this.throwDistance = throwDistance;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", throwDistance=" + throwDistance +
                '}';
    }
}
