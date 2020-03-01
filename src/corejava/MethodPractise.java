package corejava;

import java.lang.reflect.Method;

public class MethodPractise {

    //main method
    public static void main(String[] args) {
        MethodPractise t = new MethodPractise();
        t.myFirstMethod();
        t.mySecondMethod(5, 6);
        myThirdMethod();
        t.myFourthMethod("Prime","Testing",10,20);
    }


    // with no return no parameters1
    //public access modifier used
    public void myFirstMethod() {
        int a = 100;
        int b = 200;
        int result = a + b;
        System.out.println(result);
    }

    //with no return with parameters
    // private access modifier used
    private void mySecondMethod(int c, int d) {
        int result = c + d;
        System.out.println(result);
    }

    //with return type with no parameters
    //protected access modifier used
    protected static int myThirdMethod() {
        int a = 1;
        int b = 2;
        int result = a + b;
        System.out.println(result);
        String name = "Dilip";
        return result;
    }

    //with return type with parameters
    //default access modifier  used so no public,protected,private
    String myFourthMethod(String firstName, String secondName, int a, int b) {
        String fullname = firstName + secondName;
        System.out.println(fullname);
        int result = a + b;
        return fullname;
    }
}
