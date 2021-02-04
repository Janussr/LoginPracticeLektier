import java.util.Scanner;

/**
 * CREATED BY Janus @ 2021-02-04 - 16:15
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println("Login system");
        Scanner input = new Scanner(System.in);
        UserRepo users = new UserRepo();


        boolean oneMore = true;

        while(oneMore){
            System.out.println("indtast brugernavn");
            String userName = input.nextLine();
            System.out.println("Indtast kodeord (indtast exit hvis du vil stoppe)");
            String password = input.nextLine();
            if (users.checkLogin(userName,password))
            {
                System.out.println("Velkommen ombord");

            }else {
                System.out.println("prøv igen - login fejl");
            }
                if (password.equals("exit"))
                {
                    oneMore = false;
                }

        }
    }
}
