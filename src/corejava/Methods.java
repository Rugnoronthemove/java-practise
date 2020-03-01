package corejava;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the value for int a");
        a = scan.nextInt();
        System.out.println("Enter the value for int b");
        b = scan.nextInt();

        Methods cal = new Methods();
        cal.addition(a,b);
        subtraction(a,b);
    }
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
    public static void subtraction(int a, int b) {
        int result = a-b;
        System.out.println(result);
    }
}
