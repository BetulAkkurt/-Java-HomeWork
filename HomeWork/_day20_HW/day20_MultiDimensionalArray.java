package HomeWork._day20_HW;

public class day20_MultiDimensionalArray {
    public static void main(String[] args) {
        int firstarray[][] = {{8,9,10},{11,12,13}} ;
        int secondarray[][] = {{14,15,16},{17,18,19}};

        System.out.println("This is the first array: ");
        display(firstarray);
        System.out.println("This is the second array: ");
        display(secondarray);

    }

    private static void display(int[][] firstarray) {
        for(int row = 0; row < firstarray.length; row++) {
            for(int column = 0; column < firstarray[row].length; column++) {
                System.out.println(firstarray[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
