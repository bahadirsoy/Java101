import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        float boy = input.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz : ");
        float kilo = input.nextFloat();

        float sonuc = kilo / (boy*boy);
        System.out.println("Vücut kitle indeksiniz : " + sonuc);
    }
}
