package HomeWork.day48;

public class InPerson extends Shop{

    public InPerson(){
        super();
        super.price =7.8;
        super.employer =4;
        super.productName = "Hallmark";

    }

    @Override
    public void buy() {
        System.out.println("Buying is from store.");
    }

    @Override
    public void selling() {
        System.out.println("Selling is available for 10 hours.");

    }
}
