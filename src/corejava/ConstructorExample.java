package corejava;

import java.awt.*;

public class ConstructorExample {

    //user define zero arguments & non parameterized
    public ConstructorExample() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    //user defined parameterized constructor
    public ConstructorExample(int a, int b) {
        System.out.println(a + b);
    }

    //main method
    public static void main(String[] args) {
        ConstructorExample CE = new ConstructorExample();
        ConstructorExample ce = new ConstructorExample(30, 50);
        System.out.println("This is main method");
    }
}
