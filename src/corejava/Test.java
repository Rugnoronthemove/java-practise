package corejava;

public class Test {

    int age = 35;
    static String myName = "Hemal";

    //main method
    public static void main(String[] args) {
        getMyage();
        //Object creation to call instance method
        Test method = new Test();
        method.getMyName();
    }

    //instance method
    public void getMyName() {
        System.out.println(age);
        //calling static variable using class name
        System.out.println(Test.myName);
    }

    //static method
    public static void getMyage() {
        System.out.println(myName);
        //object creation to call instance variable
        Test obj = new Test();
        System.out.println(obj.age);
    }

}
