import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serial;

public class main {
    public static void main(String[] args) {
        // Dosya yolu
        String dosyaYolu = "./giris.txt";
        int memory = 0;
        int writer = 0;
        int reader = 0;
        int modem = 0;
        int cdReader = 0;
        int processTime = 0;
        int totalProcesTime = 0;
        int arrivalTime = 0;


        try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                // Satırdaki değerleri virgül ile ayır ve boşlukları temizle
                String[] stringDizi = satir.split(",\s*");

                // String diziyi int dizisine dönüştür
                int[] intDizi = new int[stringDizi.length];
                for (int i = 0; i < stringDizi.length; i++) {
                    intDizi[i] = Integer.parseInt(stringDizi[i]);
                }
                
                if(intDizi[1] == 0){
                    System.out.println("Gerçek zamanlı");
                    arrivalTime = stringDizi[];
                    memory = intDizi[3];
                    processTime = intDizi[2];
                    totalProcesTime = processTime + arrivalTime;
                    writer = intDizi[4];
                    reader = intDizi[5];
                    modem = intDizi[6];
                    cdReader = intDizi[7];
                    System.out.println("Geliş zamanı: " + arrivalTime + "\n" + "Çıkış zamanı: " + totalProcesTime);
                }


                // System.out.println(intDizi[3]);

                // Diziyi ekrana yazdır
                // for (int sayi : intDizi) {
                //     System.out.println(sayi);
                // }

                System.out.println(); // Her satırın ardından bir boşluk bırak
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}