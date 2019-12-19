package HomeWork.day48;

public class Main {

        public static void main(String[] args) {

            Shop obj = new Online(35);
            System.out.println(obj);
            System.out.println(obj.employer);
            System.out.println("-------------------");
            System.out.println(obj.price);
            System.out.println("-------------------");
            System.out.println(obj.productName);
            System.out.println("-------------------");


            obj.buy();
            obj.selling();



            Shop obj1 = new InPerson();
            System.out.println("-------------------");
            System.out.println(obj1);

            System.out.println(obj1.productName);
            System.out.println("-------------------");

            System.out.println(obj1.price);
            System.out.println("-------------------");

            System.out.println(obj1.employer);
            System.out.println("-------------------");


            obj1.buy();
            obj1.selling();



        }

}

