import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz: ");
        double tutar = input.nextDouble();
        double kdvOran = tutar < 1000 && tutar > 0 ? 0.18 : 0.08;

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li Tutarı :" + kdvliTutar);
    }
}
