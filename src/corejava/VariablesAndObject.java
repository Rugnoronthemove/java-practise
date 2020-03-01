package corejava;

public class VariablesAndObject {
    //instance variable - variables declared inside class but outside the method or constructor eg - a and b
    int             a;
    int             b=10;
    String          name="Prime";
    String          name1="Testing";

    //Static variable or Global variable - variable declared inside class but outside the method with use of static keyword
    static  int      e=500;
    static  String   f="India";

        //static method
        public static void main(String[] args) {
            //local variables- variables declared in method or constructor eg- c and d variables
            int c = 20;
            String d = "Hello";
            //calling or accessing static variable in static area
            System.out.println(e);
            System.out.println(f);

            //object creation - use of obj is just a reference to object creation
            VariablesAndObject obj= new VariablesAndObject();
            System.out.println(obj.b);
            System.out.println(obj.name);

            }

        //instance method
        public void instanceMethod(){
            //this area is called instance area
            System.out.println(b);
            System.out.println(name);

                //calling or accessing static variables into instance area
                //instance or static variable declared in class can be called anywhere eg- variable f

                //System.out.println(VariablesAndObject.e);
                System.out.println(e);
                System.out.println(f);


            }
        //static method
         public static void staticMethod(){
            //this area is called static area


            }

}
