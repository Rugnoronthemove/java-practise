package corejava;

import java.util.Scanner;

public class MethodsPractiseSelfStudy {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a;
        int b;
        System.out.println("enter value for a");
        a = scan.nextInt();
        System.out.println("enter value for b");
        b = scan.nextInt();
        MethodsPractiseSelfStudy add = new MethodsPractiseSelfStudy();
        add.addition();
        subtraction();
        MethodsPractiseSelfStudy add1 = new MethodsPractiseSelfStudy();
        add1.addition1();
        subtraction1();
        //how do i pull the result & result1 from instance methods of addition and addition1
        //System.out.println(add.result);
        //System.out.println(add1.result2);
    }

    public void addition() {
        int a = 10;
        int b = 10;
        int result = a + b;
        System.out.println(result);
    }

    public static void subtraction() {
        int c = 20;
        int d = 20;
        int result1 = c - d;
        System.out.println(result1);
    }

    public void addition1() {
        int e = 20;
        int f = 20;
        int result2 = e + f;
        System.out.println(result2);
    }

    public static void subtraction1() {
        int g = 80;
        int h = 40;
        int result3 = g - h;
        System.out.println(result3);
    }

//public void

}
