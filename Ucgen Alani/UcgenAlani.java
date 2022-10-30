import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        int a = input.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        int b = input.nextInt();

        System.out.print("3. Kenarı Giriniz : ");
        int c = input.nextInt();

        double u = (a+b+c)/2;
        double cevre = 2*u;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Alan : " + alan);
    }
}
