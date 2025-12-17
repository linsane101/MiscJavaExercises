import java.util.Scanner;

public class IfChallenge {
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        System.out.println("Input age number: ");
        int age = number.nextInt();
        boolean result = isTooYoung(age);
        if(result == true)
        {
            System.out.println("Too young");
        }
        else
        {
            System.out.println("You can drink");
        }
    }
    public static boolean isTooYoung(int age)
    {
        boolean result = false;
        if(age < 21)
        {
            result = true;
        }
        return result;
    }
}
