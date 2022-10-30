import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5f;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        int armutKilo = input.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        int elmaKilo = input.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        int domatesKilo = input.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        int muzKilo = input.nextInt();

        System.out.print("Patlican Kaç Kilo ? : ");
        int patlicanKilo = input.nextInt();

        float tutar = (armut * armutKilo + elma * elmaKilo + domates * domatesKilo + muz * muzKilo + patlican * patlicanKilo);
        System.out.println("Toplum Tutar : " + tutar);

    }
}
