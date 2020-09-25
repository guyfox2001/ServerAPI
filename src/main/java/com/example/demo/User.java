package com.example.demo;



public class User {
    private String name;
    private int age;
    private int weightOfDick;

    public User(String name, int age, int weightOfDick) {
        this.name = name;
        this.age = age;
        this.weightOfDick = weightOfDick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeightOfDick() {
        return weightOfDick;
    }

    public void setWeightOfDick(int weightOfDick) {
        this.weightOfDick = weightOfDick;
    }

}
