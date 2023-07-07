// Corey Williams
// Assignment 8
// 06/25/2023

// 1 (a) Get methods are used to retrieve values of private variables in a class

public class Words {
    private String word;

    public String getword() {
        return word;
    }
}

// 1 (b) Set methods are used modify the values of private variables in a class.

public class Words {
    private String word;

    public void setword(String newWord) {
        word = newWord;
    }
}

//1 (c) A constructor is a method that is used to initialize objects of a class.

public class Words {
    private String word;

    public Person(String initialWord) {
        word = initialWord;
    }
}

// 1 (d) A final variable is a variable in which the value can not be changed once assigned.

public class Circle {
    private final double PI = 3.14;
    private double radius;

    public double calculateArea() {
        return PI * radius * radius;
    }
}
