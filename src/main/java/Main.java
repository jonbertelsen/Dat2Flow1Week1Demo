import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Login system");
        Scanner input = new Scanner(System.in);

        UserRepository users = new UserRepository();

        System.out.println("Jon Bertelsen SHA-1: " + Util.encryptThisString("123"));
        System.out.println("Jønke SHA-1: " + Util.encryptThisString("321"));
        System.out.println("Blondie SHA-1: " + Util.encryptThisString("456"));


        boolean oneMore = true;

        while (oneMore)
        {
            System.out.println("Indtast brugernavn:");
            String userName = input.nextLine();
            System.out.println("Indtast kodeord (tast exit hvis du vil stoppe:");
            String password = input.nextLine();
            if (users.checkPassword(userName, password))
            {
                System.out.println("Velkommen ombord");
            } else
                {
                    System.out.println("Prøv igen - der var fejl i kode eller brugernavn");
                }
            if (password.equals("exit"))
            {
                oneMore = false;
            }

        }



    }
}
