public class ThreeAlgoritms {

    public static void main(String[] args) {
        System.out.println(system(10111001));
    }

    public static int system(int n){

        int numberOfDigits = String.valueOf(n).length();
        int decimalValue = 0;

        for (int i = 0; i < numberOfDigits; i++) {

            int lastDigit = n % 10;
            decimalValue += lastDigit * Math.pow(2, i);
            n /= 10;
        }
        if (decimalValue >= 0) {
            return decimalValue;

        } else {
            return -1;
        }
    }
}