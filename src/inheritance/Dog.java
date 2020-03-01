package inheritance;

public class Dog extends Animal{

    private int tail = 1;

    public static void main(String[] args) {
        //child class object use recemonded as allows to call
        // properties & behaviour from both parent & child class
        Dog obj = new Dog();
        /*parent class object use not recommended as will only allow to call
         parentclass properties & behaviour
        Animal obj1 = new Animal()*/

        System.out.println(obj.name);

        obj.eat();
        obj.move(); //
        obj.barking(); //child class method
    }

    public void barking(){
        System.out.println("Dog is barking");
    }

}
