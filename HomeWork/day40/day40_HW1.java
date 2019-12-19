package HomeWork.day40;

//package HomeWork;
//
//public class day40_HW {
//
//    //*********************************************************************************************
//    //What will be the output of the following Java program?
//======> compile error
//    class X
//    {
//        //Class X Members
//
//    }
//
//    class Y
//    {
//        //Class Y Members
//    }
//
//    class Z extends X
//    {
//        //Class Z Members
//    }
//
//    //*********************************************************************************************
//    //What will be the output of the following Java program?
// ===============> 10
//    class A
//    {
//        int i = 10;
//    }
//
//    class B extends A
//    {
//        int i = 20;
//    }
//
//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            A a = new B();
//
//            System.out.println(a.i);
//        }
//    }
//    //*********************************************************************************************
//   // What will be the output of the following Java program?
// ==============>  //1
                    // 2
                    // 3
//    class A
//    {
//        {
//            System.out.println(1);
//        }
//    }
//
//    class B extends A
//    {
//        {
//            System.out.println(2);
//        }
//    }
//
//    class C extends B
//    {
//        {
//            System.out.println(3);
//        }
//    }
//
//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
//    //*********************************************************************************************
//    //What will be the output of the following Java program?
// =================>   clas A
//                      clas B
//                      clas C
//    class A
//    {
//        String s = "Class A";
//    }
//
//    class B extends A
//    {
//        String s = "Class B";
//
//        {
//            System.out.println(super.s);
//        }
//    }
//
//    class C extends B
//    {
//        String s = "Class C";
//
//        {
//            System.out.println(super.s);
//        }
//    }
//
//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//
//            System.out.println(c.s);
//        }
//    }
//    //*********************************************************************************************
//   // What will be the output of the following Java program?
// =================> third,second, first
//    class A
//    {
//        static
//        {
//            System.out.println("THIRD");
//        }
//    }
//
//    class B extends A
//    {
//        static
//        {
//            System.out.println("SECOND");
//        }
//    }
//
//    class C extends B
//    {
//        static
//        {
//            System.out.println("FIRST");
//        }
//    }
//
//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
//    //*********************************************************************************************
//    //What will be the output of the following Java program?
// ==================>  Class A Constructor
//                      Class B Constructor
//                      Class C Constructor
//    class A
//    {
//        public A()
//        {
//            System.out.println("Class A Constructor");
//        }
//    }
//
//    class B extends A
//    {
//        public B()
//        {
//            System.out.println("Class B Constructor");
//        }
//    }
//
//    class C extends B
//    {
//        public C()
//        {
//            System.out.println("Class C Constructor");
//        }
//    }
//
//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
//
//    //*********************************************************************************************
//    //What will be the output of the following Java program?
// ===========> Class Y
//    class X
//    {
//        static void staticMethod()
//        {
//            System.out.println("Class X");
//        }
//    }
//
//    class Y extends X
//    {
//        static void staticMethod()
//        {
//            System.out.println("Class Y");
//        }
//    }
//
//    class MainClass
//    {
//        public static void main(String[] args)
//        {
//            Y.staticMethod();
//        }
//    }
//    //*********************************************************************************************
//   // What will be the output of the following Java program?
//   =========> compile error
//    class X
//{
//    public X(int i)
//    {
//        System.out.println(1);
//    }
//}
//
//class Y extends X
//{
//    public Y()
//    {
//        super(2);
//        System.out.println(2);
//    }}
//}
//


