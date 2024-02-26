package com.mins.test;

public class AServiceImpl implements AService {

    private String name;

    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }

    public AServiceImpl(String name, int level) {
        this.name = name;
        this.level = level;
    }
}
