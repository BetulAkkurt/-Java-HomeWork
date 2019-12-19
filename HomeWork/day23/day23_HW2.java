package HomeWork.day23;

public class day23_HW2 {
    public static void main(String[] args) {

    int[] prices = new int[]{1,2,3,4,5};

    int max = 0;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length ; i++) {
        if(prices[i] < min) {
            min = prices[i];
        } else {
            max = Math.max(max, prices[i] - min);
        }

    }

    System.out.println(max);

}
}

