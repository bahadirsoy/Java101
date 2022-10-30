import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;


        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        mat = scan.nextInt();

        System.out.print("Fizil notu: ");
        fizik = scan.nextInt();

        System.out.print("Kimya notu: ");
        kimya = scan.nextInt();

        System.out.print("Türkçe notu: ");
        turkce = scan.nextInt();

        System.out.print("Tarih notu: ");
        tarih = scan.nextInt();

        System.out.print("Müzik notu: ");
        muzik = scan.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0d;
        System.out.println("Ortalamanız : " + sonuc);

        System.out.println(sonuc > 60 ? "Sınıfı geçti." : "Sınıfta kaldı.");
    }
}
