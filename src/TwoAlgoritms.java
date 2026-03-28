public class TwoAlgoritms {
    public static void main(String[] args) {
        System.out.println(isArmstrong(452));
    }

    public static boolean isArmstrong(int n) {
        int orjinalSayi = n;
        int toplam = 0;
        int basamakSayisi = String.valueOf(n).length();

        while (n > 0) {
            int basamak = n % 10;
            n /= 10;
            toplam += (int) Math.pow(basamak, basamakSayisi);
        }

        if (toplam == orjinalSayi) {
            return true;
        } else {
            return false;
        }
    }
}