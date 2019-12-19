package HomeWork.day32;

import day35_nov19.Food;

// create class Food
// add at least 5 attributes
// add at least 2 methods
//
public class day32_HW2 {
    public static void main(String[] args) {

        Food pilav = new Food();

        pilav.name = "Ozbek Pilavi";
        pilav.sideDish = "Yoghurt";
        pilav.ingredients = "meat, rice, carrot, onion, garlic, butter";
        pilav.oil = "butter";
        pilav.amountOfIngredients = 6;

        pilav.taste();

        boolean boo = pilav.hasButter("butter");
        System.out.println(boo);
    }
}

