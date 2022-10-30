import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main (String[]args){
        int[] arr = new int[3];

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayı : ");
        arr[0] = input.nextInt();

        System.out.print("2. sayı : ");
        arr[1] = input.nextInt();

        System.out.print("3. sayı : ");
        arr[2] = input.nextInt();

        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
