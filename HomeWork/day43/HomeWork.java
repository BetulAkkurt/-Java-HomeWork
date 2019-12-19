package HomeWork.day43;

// Let's write a Online-Shop that sells books: ChildrenBook & Comics
// use inheritance, polymorphism and encapsulation while doing this

// Note: this HW is open-ended, so there a lot of way to solve it
// task about salary is similar to this

// Hint: you can use Book as parent class and define price() method there
public class HomeWork {
    public static void main(String[] args) {
        Books b1 = new ChildrenBook();
        b1.setBookName("AWL");
        b1.setType("for children");
        b1.setPageNumber(150);
        b1.setWriter("XYZ");
        b1.price();


        Books b2 = new Comics();
        b2.setBookName("Spider Man");
        b2.setType("Comics");
        b2.setPageNumber(100);
        b2.setWriter("ABC");
        b2.price();

    }
}
