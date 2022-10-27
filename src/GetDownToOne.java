import java.util.Scanner;

public class GetDownToOne
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to halve to one? ");
        int userNumber = scanner.nextInt();
        int halvings = 0;

        while (userNumber > 1){
            userNumber /= 2;
            System.out.println(userNumber);
            halvings++;
        }
        System.out.println("There are " + halvings + " halvings to get to 1.");

    }
}
