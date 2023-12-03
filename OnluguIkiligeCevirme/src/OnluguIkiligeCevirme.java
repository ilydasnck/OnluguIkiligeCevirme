import java.util.Scanner;

public class OnluguIkiligeCevirme {

    public static void main(String[] args) {
        int sayilar[] = new int[10]; // 10 elemanlı bir dizi oluşturuldu (çünkü en fazla 10 bitli bir sayı elde edilebilir)
        System.out.println("Onluk tabanda bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        double onlukSayi = input.nextDouble();
        int i = 0;

        while ((onlukSayi / 2) >= 1) {
            int kalan = (int) (onlukSayi % 2);
            sayilar[i] = kalan;
            onlukSayi = onlukSayi / 2;
            i += 1;
        }
        sayilar[i] = (int) onlukSayi;

        // Diziyi tersten yazdırma işlemi
        System.out.println("Onluk tabandaki sayısının ikilik tabandaki karşılığı: ");
        for (int j = i; j >= 0; j--) {
            System.out.print(sayilar[j]);
        }
    }
}