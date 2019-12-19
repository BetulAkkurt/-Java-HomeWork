package HomeWork._day20_HW;

public class day20 {
    public static void main(String[] args) {


// research on topics "Multi Dimensional Arrays", "Nested Loops"

        //TODO Task
        // 1. Return the number of even ints in the given array.
        // {1,2,3,4,5,6} => 3
        // Hint: you need to count "even numbers"

            int[] intArray = {1, 2, 3, 4, 5, 6};

            int evenCounter = 0;
            for (int i = 0; i < intArray.length; i++) {
                int currentNumber = intArray[i];
                boolean numberIsEven = currentNumber % 2 == 0;

                if (numberIsEven) {
                    evenCounter++;
                }
            }

            System.out.println("you have " + evenCounter + " even numbers");
        }
    }

