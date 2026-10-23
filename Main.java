import java.util.Scanner; // Kullanıcıdan veri almak için gerekli kütüphane

public class Main {
    public static void main(String[] args) {
        // Klavyeden veri okuyacak Scanner nesnesini oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BASİT HESAP MAKİNESİ ===");
        
        // Kullanıcıdan birinci sayıyı istiyoruz
        System.out.print("Lütfen ilk sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        // Kullanıcıdan ikinci sayıyı istiyoruz
        System.out.print("Lütfen ikinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        // Toplama işlemini yapıyoruz
        int toplam = sayi1 + sayi2;

        // Sonucu ekrana yazdırıyoruz
        System.out.println("----------------------------");
        System.out.println("Girdiğiniz sayıların toplamı: " + toplam);

        // İşimiz bittiğinde scanner'ı kapatıyoruz
        scanner.close();
    }
}