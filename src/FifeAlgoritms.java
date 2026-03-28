public class FifeAlgoritms {

    public static void main(String[] args) {

        System.out.println(isStrongNumbers(145));
    }



    public static boolean isStrongNumbers(int n ) {

        int sum = 0;
        int originalNumber = n;

        while (n > 0) {

            int lastDigit = n % 10;
            sum = sum + factorialCalculation(lastDigit);
            n /= 10;
            System.out.print("Numbers : " +lastDigit);
            System.out.print(" Total : " + sum);

        }
        if (sum == originalNumber) {
            System.out.println("\nYour number : " + originalNumber + " is a strong number");
            return true;
        } else {
            return false;
        }
    }

    public static int factorialCalculation(int number) {

        int factorial = 1;
        for (int i  = 1; i<= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
