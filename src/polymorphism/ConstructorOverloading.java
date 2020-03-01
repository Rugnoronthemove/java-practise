package polymorphism;

/*

 */

public class ConstructorOverloading {

    public ConstructorOverloading() {
        System.out.println("This is no parameterised constructor");
    }

    public ConstructorOverloading(int a) {
        System.out.println("one parameter constructor");
    }

    public ConstructorOverloading(int a, int b) {
        System.out.println("two parameter constructor");
    }
    public ConstructorOverloading(String name){
        System.out.println("one parameter constructor");
    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading("Prime");
        ConstructorOverloading obj1 = new ConstructorOverloading(10,20);
        ConstructorOverloading obj2 = new ConstructorOverloading(15);
        ConstructorOverloading obj3 = new ConstructorOverloading();

    }

}
