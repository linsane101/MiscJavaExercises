import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int counter = 0;
        do{
            System.out.print("Enter a number: ");
            String input = obj.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number >= min && counter == 1 || number <= min) {
                    min = number;
                } else if (number >= max) {
                    max = number;
                }
                counter++;
            }
            catch(NumberFormatException e)
            {
                break;
            }
        }while(counter > 0);
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}
