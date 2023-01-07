import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     //1000 Tl'ye kadar % 18 kdv uygulanırken 1000 Tl'den sonra % 8 kdv uygulanır

     double tutar, kdvOrani, kdvTutari, kdv1 = 0.18, kdv2 = 0.08, toplamTutar;

     Scanner input = new Scanner(System.in);
     String fiyat = "Tutarı giriniz: ";

     System.out.print(fiyat);
     tutar = input.nextDouble();

     kdvOrani = tutar < 1000 ? kdv1 : kdv2;
     kdvTutari = tutar < 1000 ? tutar * kdv1 : tutar * kdv2;
     toplamTutar = tutar + kdvTutari;

     System.out.println("KDV'siz Tutar = " + tutar);
     System.out.println("KDV Oranı = " + kdvOrani);
     System.out.println("KDV Tutarı = " + kdvTutari);
     System.out.println("Toplam Tutar = " + toplamTutar);
}
}