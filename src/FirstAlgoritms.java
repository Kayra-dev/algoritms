import java.util.concurrent.ThreadLocalRandom;

public class FirstAlgoritms {

    public static void main(String[] args) {
        long sayi = ThreadLocalRandom.current().nextLong(10, 1000000);

        System.out.println("Sayı: " + sayi);

        if (isRakamlarEssiz(sayi)) {
            System.out.println("Sonuç: True (Tekrar eden rakam yok)");
        } else {
            System.out.println("Sonuç: False (Tekrar eden rakam var)");
        }
    }


    public static boolean isRakamlarEssiz(long sayi) {
        boolean[] rakamGorulduMu = new boolean[10];
        while (sayi > 0) {
            int sonRakam = (int) (sayi % 10);
            if (rakamGorulduMu[sonRakam]) {
                return false;
            }
            rakamGorulduMu[sonRakam] = true;
            sayi /= 10;
        }

        return true;
    }
}