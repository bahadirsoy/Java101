import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        int r = input.nextInt();

        System.out.print("Merkez açısı ölçüsünü giriniz : ");
        int a  = input.nextInt();

        double alan = Math.PI * r * r * (a/360d);
        System.out.println("Dairenin alanı : " + alan);
    }
}
