# İşletim Sistemi Simülasyonu

Bu Java programı, giriş.txt dosyasındaki verilere göre işletim sistemi simülasyonunu gerçekleştiren basit bir uygulamadır.

## Kullanım

1. **Java Yükleme:**
   - Java Runtime Environment (JRE) yüklü değilse, [Oracle'nin resmi sitesinden](https://www.oracle.com/java/technologies/javase-downloads.html) Java'yı indirip yükleyin.

2. **Programı Çalıştırma:**
   - Terminal veya Komut İstemi'ni açın.
   - Projenin bulunduğu dizine gidin.
   - `java OperatingSystemSimulation` komutunu kullanarak programı başlatın.

3. **Giriş.txt Dosyası:**
   - Giriş.txt dosyasında her satır şu formatta olmalıdır: `Gelme Zamanı, Öncelik, Process Zamanı, Memory, Kaynak1, Kaynak2, Kaynak3, Kaynak4`

4. **Çıktıları İnceleme:**
   - Program çalıştığında, işlem sonuçları terminal veya komut istemine yazdırılacaktır.

## Proje Açıklaması

Proje, giriş.txt dosyasındaki verilere göre processleri yönetir ve kaynak kullanımını kontrol eder. Program, öncelik değerine göre sıralama yapar, kaynakları kontrol eder ve hataları rapor eder.

## Proje Yapısı

- `main.java`: Ana program dosyası.
- `Process.java`: Process sınıfını tanımlayan dosya.

## Önemli Notlar

- Toplamda 1024 MB hafıza mevcuttur.
- Gerçek zamanlı processlerin önceliği 0'dır.
- Diğer processlerin öncelikleri 1, 2 ve 3'tür.
- Aynı anda çalışan processlerin kaynakları kontrol edilir.

Bu README dosyası, projenin temel işleyişini anlatmak için oluşturulmuştur. Daha fazla ayrıntı ve geliştirmeler için kodu inceleyebilirsiniz.
