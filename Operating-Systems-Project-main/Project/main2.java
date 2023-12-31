import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main2 {
    public static void main(String[] args) {
        // Dosya yolu
        String dosyaYolu = "./giris.txt";

        // Aranacak satır ve sütun indeksleri
        int[] arananSatir; // Örneğin 1. satır
        int arananSutun = 2; // Örneğin 2. sütun

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            int satirSayisi = 0;

            while ((satir = br.readLine()) != null) {
                satirSayisi++;

                // İlgili satıra gelene kadar devam et
                if (satirSayisi < arananSatir) {
                    continue;
                }

                // Satırdaki değerleri virgül ile ayır ve boşlukları temizle
                String[] stringDizi = satir.split(",\\s*");

                // Aranan sütunda değeri bul ve ekrana yazdır
                if (stringDizi.length >= arananSutun) {
                    int arananDeger = Integer.parseInt(stringDizi[arananSutun - 1]);
                    System.out.println("Aranan değer: " + arananDeger);
                    break; // İlgili satırı bulduk, döngüyü sonlandır
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}