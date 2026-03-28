public class FourAlgoritms {

    public static void main(String[] args) {
        boolean sonuc = Kapkare(45);
        System.out.println("İşlem sonucu (Kaprekar mı?): " + sonuc);
    }

    public static boolean Kapkare(int n) {

        int karesi = (int) Math.pow(n, 2);
        System.out.println("Sayının karesi : " + karesi);

        String kareStr = String.valueOf(karesi);


        int ortaIndex = kareStr.length() / 2;

        String solTarafStr = kareStr.substring(0, ortaIndex);
        String sagTarafStr = kareStr.substring(ortaIndex);

        int solSayi = solTarafStr.isEmpty() ? 0 : Integer.parseInt(solTarafStr);
        int sagSayi = Integer.parseInt(sagTarafStr);

        System.out.println("Sayının sol tarafı: " + solSayi);
        System.out.println("Sayının sağ tarafı: " + sagSayi);

        if (solSayi + sagSayi == n) {
            System.out.println(n + " bir Kaprekar sayısıdır!");
            return true;
        } else {
            System.out.println(n + " bir Kaprekar sayısı DEĞİLDİR.");
            return false;
        }
    }
}