import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        char chngPass;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika")) {
            if (password.equals("java123")) {
                System.out.println("Giriş yaptiniz");
            } else {
                System.out.println("Bilgileriniz Yanlış!");
                System.out.print("Şifrenizi sıfırlamak ister misiniz? E/H :");
                chngPass = inp.next().charAt(0);

                if (chngPass == 'E') {
                    System.out.print("Lütfen yeni şifrenizi giriniz : ");
                    String newPassword = inp.next();
                    if (newPassword.equals(password) || newPassword.equals("java123")) {
                        System.out.println("Eski bir şifrenizi girdiğiniz için işlem başarısız.");
                    } else {
                        System.out.println("Şifreniz başarıyla değiştirildi.");
                    }

                } else if (chngPass == 'H') {
                    System.out.println("Şifre oluşturma iptal edildi.");
                } else {
                    System.out.print("Lütfen geçerli bir ifade giriniz. E/H");
                }
            }
        } else {
            System.out.println("Hatalı kullanıcı adı");
        }
    }
}
