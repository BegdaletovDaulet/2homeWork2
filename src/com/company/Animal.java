package com.company;

public class Animal implements Printable{
    protected int age;
    protected String name;
    protected Color color;

    public Animal(int age, String name, Color color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Имя: " + name + " Цвет: " + color + " Возвраст: " + age);
    }
}
