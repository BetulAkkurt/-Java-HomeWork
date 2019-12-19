package HomeWork.day48;
// Let's write a Shop that could be in-person and online
// that sells different items

// use OOP
public abstract class Shop {
    String productName;
    double price;
    int employer;

    public abstract void buy();

    public abstract void selling();

    public void Shipping(){
        System.out.println("shipping is available for both of them");
    }



}
