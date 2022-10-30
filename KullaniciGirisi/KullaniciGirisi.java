import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        username = input.nextLine();

        System.out.print("Şifeniz : ");
        password = input.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız !");
        } else{
            System.out.print("Yanlış şifre. Şifrenizi sıfırlamak ister misiniz ? (evet/hayir)");
            String cevap = input.nextLine();

            if(cevap.equals("evet")){
                System.out.print("Yeni şifrenizi giriniz : ");
                String newPassword = input.nextLine();

                if(newPassword == password || newPassword == "java123") System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                else System.out.println("Şifre oluşturuldu");
            }
        }
    }
}