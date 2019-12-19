package HomeWork.day44;

public class HW2 {
    //write a Sum class
//create a sum method that accepts 2 int parameters, x, y and returns int as a result;
//create a sum method overload that accepts 3 parameters and takes 3 int parameters, x, y, z
//create a sum method overload that accepts 2 double parameters x, y, and returns a double.
//in your main method call the class and run these 3 methods.

    public static void main(String[] args) {
        Sum sum1 = new Sum();

        System.out.println(sum1.sum(1,2));
        System.out.println((sum1.sum(1,2,3)));
        System.out.println(sum1.sum(1.0,2.0));



    }
}
class Sum {
    public int sum(int x, int y){
        return x + y;

    }

    public int sum(int x , int y , int z){
        return  x + y + z;

    }

    public double sum(double x  , double y){
        return (x+y);

    }
}


//2. Can we overload methods on return type?
//will this work???? why? why not?

 //  ANSWER; NO WE CANT THIS IS AMBIGUTY.IT NEED ADD PARAMETERS INSIDE METHOD'S PARENTHESIS

//public class Main
//{
//    public int foo() { return 10; }
//
//    public char foo() { return 'a'; }
//
//    public static void main(String args[])
//    {
//    }
//}

//3. Can we overload static methods?
// ANSWER: YES WE CAN

//4. Can we overload methods that differ only by static keyword?
//will this work???? why? why not?

//ANSWER: YES WE CAN!

//public class Test
//{
//    public static void foo()
//    {
//        System.out.println("Test.foo() called ");
//    }
//    public void foo()
//    { // Compiler Error: cannot redefine foo()
//        System.out.println("Test.foo(int) called ");
//    }
//    public static void main(String args[])
//    {
//        Test.foo();
//    }
//}

//5. Can we overload main() in Java?
    //ANSWER: YES WE CAN, BUT IT TAKE TAKES FIRST MAIN METHOD

//6. What is the difference between Overloading and Overriding?
    //ANSWER: OVERRIDING HAS THE SAME METHOD NAMES AND SAME PARAMETRS.OVERRIDING WORKS  ON RUN TIME.
    //OVERLOADING IS SAME METHODS BUT DIFFERANT PARAMETERS OR TYPES.OVERLOADING WORKS ON COMPILE TIME.
    //	final,sttatic and private methods can be overloaded but cannot be overridden
    //	You can overload a method in the same class but overriding occurs in the inherited classes

//7. Can we Override static methods in java?
    //ANSWER: NO WE CANT

//it is related to question 7.
//what is the output of this program? why? why not?

    //ANSWER: Static or class method from Base. BCS THIS IS STATIC,IT CAN NOT OVERRIDING.
    //Non-static or Instance method from Derived.BCS IT IS NON-STATIC,IT CAN  OVERRIDING.
//class Base
//{
//    public static void display()
//    {
//        System.out.println("Static or class method from Base");
//    }
//   public void print()
//    {
//        System.out.println("Non-static or Instance method from Base");
//    }
//}
//
//class Derived extends Base
//{
//public static void display()
//{
//    System.out.println("Static or class method from Derived");
//}
//public void print()
//{
//    System.out.println("Non-static or Instance method from Derived");
//}
//}
//
//public class Test
//{
//    public static void main(String args[ ])
//    {
//        Base obj1 = new Derived();
//        obj1.display();
//
//        obj1.print();
//    }
//}

