package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable {
    private static final long serialVersUID = 1L;

    private Long id;
    private String name;
    private double DailyIncome;

    public Worker(Long id, String name, double dailyIncome) {
        this.id = id;
        this.name = name;
        DailyIncome = dailyIncome;
    }


    public Worker() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyIncome() {
        return DailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        DailyIncome = dailyIncome;
    }


}
