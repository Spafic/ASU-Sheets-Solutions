
public class Problem5 {
    public static double sumArray(double[] numbers) {
        double sum = 0;
        //for each logic
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] myArray = {1.2, 2.333, 3, 4, 5};
        System.out.println("The sum is: " + sumArray(myArray));
    }
}
