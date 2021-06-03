package com.company;

public class Elephant extends Animal implements Printable {
    private int whole;

    public Elephant(int age, String name, Color color) {
        super(age, name, color);
    }

    public Elephant(int age, String name, Color color, int whole) {
        super(age, name, color);
        this.whole = whole;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Имя: " + name + " Цвет: " + color + " Возвраст: " + age + " Вес: " + whole);
    }
}
