import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Login system");
        Scanner input = new Scanner(System.in);

        UserRepository users = new UserRepository();

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
