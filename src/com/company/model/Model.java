package com.company.model;

public class Model {
    private String name;
    private Integer age;
    private Integer prelim;
    private Integer midterm;
    private Integer finals;

    public Model(String name, Integer age, Integer prelim, Integer midterm, Integer finals) {
        this.name = name;
        this.age = age;
        this.prelim = prelim;
        this.midterm = midterm;
        this.finals = finals;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPrelim() {
        return prelim;
    }

    public void setPrelim(Integer prelim) {
        this.prelim = prelim;
    }

    public Integer getMidterm() {
        return midterm;
    }

    public void setMidterm(Integer midterm) {
        this.midterm = midterm;
    }

    public Integer getFinals() {
        return finals;
    }

    public void setFinals(Integer finals) {
        this.finals = finals;
    }
}
