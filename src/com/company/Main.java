package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal createObject = createObject("elephant");
        createObject.print();
        Animal cowCreateObject = createObject("cow");
        cowCreateObject.print();
        Animal eagleCreateObject = createObject("eagle");
        eagleCreateObject.print();
    }

    public static Animal createObject(String className) {

        switch (className) {
            case "elephant":
                Elephant elephant = new Elephant(3, "Слон", Color.GRAY, 230);
                return elephant;
            case "cow":
                Cow cow = new Cow(5, "Гелбфри", Color.BROWN, "Немецкий");
                return cow;
            case "eagle":
                Eagle eagle = new Eagle(2, "Bozkurt", Color.BLACK, 1);
                return eagle;

            default:
                return null;
        }
    }
}
