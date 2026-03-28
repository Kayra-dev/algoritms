import java.util.HashSet;

public class SixAlgoritms {

    public static void main(String[] args) {
        System.out.println(happyNumbers(19));
    }

    public static int happyNumbers(int n) {
        HashSet<Integer> watchNumber = new HashSet<>();

        while (n != 1 && !watchNumber.contains(n)) {
            watchNumber.add(n);
            n = sumOfSquares(n);
            System.out.println("Newly created number : " + n);
        }

        if (n == 1) {
            return 1;
        } else {
            System.out.println("Number is not happy :(");
            return 0;
        }
    }
    public static int sumOfSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, 2);
            number /= 10;
        }
        return sum;
    }
}