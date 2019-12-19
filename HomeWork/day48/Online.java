package HomeWork.day48;

public class Online extends Shop{

    public Online(int productNumber){
        super.price = 5.8;
        super.employer = 25;
        super.productName = "Disney";
       // productNumber =35;

    }
    @Override
    public void buy() {
        System.out.println("buying is available for 24 hours.");
    }

    @Override
    public void selling() {
        System.out.println("Selling by online ");
    }
}
