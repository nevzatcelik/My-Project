package Java01;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        //Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen topun birakildigi ilk yuksekligi giriniz ");
        double yukseklik = scan.nextDouble();

        double toplamYol = 0;
        int yereVurmaSayisi = 0;

        do {
            yereVurmaSayisi++;
            toplamYol += yukseklik;
            yukseklik *= 0.75;
            toplamYol += yukseklik;

        } while (yukseklik >= 1);

        System.out.println("Topun yere vurma sayisi : " + yereVurmaSayisi);
        System.out.println("Topun yere vurma sayisi : " + toplamYol);
    }
}
