package com.company;

public class Eagle extends Animal implements Printable{
    private int wings;

    public Eagle(int age, String name, Color color) {
        super(age, name, color);
    }

    public Eagle(int age, String name, Color color, int wings) {
        super(age, name, color);
        this.wings = wings;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Имя: " + name + " Цвет: " + color + " Возвраст: " + age + " Крылья: " + wings);

    }
}
