import java.util.Scanner;

public class Kasir {

        String Username = "angelio";
        String Password = "1204";
        String Captcha  = "dbwsfx";
        Boolean loginBenar = false;
        Boolean inputcaptchaBenar = false;
        String usernameBenar, passwordBenar,captchaBenar;

        public String getUsernameBenar() {
            return usernameBenar;
        }

    public void Login() {
        System.out.println("SELAMAT DATANG DI ANGEL'S MART");
        System.out.println("===========================");
        System.out.println("Log In");
 
        try (Scanner scanner = new Scanner(System.in)) {
            {

                while (!loginBenar) {
                    System.out.print("Username  : ");
                    usernameBenar = scanner.nextLine();
                    System.out.print("Password  : ");
                    passwordBenar = scanner.nextLine();

                    if (usernameBenar.equals(Username) && passwordBenar.equals(Password)) {
                        break;
                    } else {
                        System.out.println("Username atau Password Salah!");
                    }
                }    

                while (!inputcaptchaBenar){
                    System.out.println("Kode Captcha : " + Captcha);
                    System.out.print("Entry Captcha : ");
                    captchaBenar = scanner.nextLine();

                    if (captchaBenar.equals(Captcha)) {
                        System.out.println("Login berhasil!");
                        break;
                    } else {
                        System.out.println("Captcha Salah!");
                    }
                }  
            }
        }   
        System.out.println("---------------------------");  
    }  
}  