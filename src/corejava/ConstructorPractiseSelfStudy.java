package corejava;

public class ConstructorPractiseSelfStudy {
    int a = 1;
    int b = 2;
    int c = 5;
    int d = 6;
    final String e = "Practise";
    static String f = "Java";

    //constructor with zero arguments
    public ConstructorPractiseSelfStudy() {
        System.out.println("Constructor without parameters:" + a + " /is not equal to b= " + b);
        int add = a + b;
        System.out.println("Constructor without parameters:" + add);
    }

    //constructor with parameter
    ConstructorPractiseSelfStudy(int a, int b) {
        System.out.println("Constructor with parameters:" + a + b);
        int add = a + b;
        System.out.println("Constructor with parameters:" + add);
    }

    //main method
    public static void main(String[] args) {
        //object creation for non parameter constructo
        ConstructorPractiseSelfStudy t = new ConstructorPractiseSelfStudy();
        //object creation for constructor with parameter
        ConstructorPractiseSelfStudy t1 = new ConstructorPractiseSelfStudy(10, 100);
        System.out.println(subtraction());
        System.out.println(t.e);
        System.out.println(f);
        //calling instance method in static area
        t.addition(10, 20);
        //calling instance method in static area
        t.addition();
    }

    //instance method
    public void addition() {
        int result = c + d;
        int result1 = a + b;
        System.out.println("result");
    }

    //instance method with parameters
    void addition(int c, int d) {
        int result = c + d;
        int result1 = a + b;
        System.out.println("result");
    }

    // static return method without parameter(make sure return method type has datatype mentioned in method)
    public static int subtraction() {
        ConstructorPractiseSelfStudy sub = new ConstructorPractiseSelfStudy();
        int result1 = sub.c - sub.d;//-1
        int result2 = sub.a + sub.b;//3
        System.out.println(result1);
        System.out.println(result2);
        return result1 + result2; //2, -13
    }
}
