import java.util.Scanner;
public class DigitSumChallenge {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int input = obj.nextInt();
        System.out.println(sumDigits(input));
    }
    public static int sumDigits(int input)
    {
        String parse = String.valueOf(input);
        int length = parse.length();
        int lastValue = input % 10;
        int holder = 0;
        int sum = 0;
        if(input < 0)
        {
            return -1;
        }
        else {
            while (length >= 0)
            {
                length--;
                sum = (int)((input/Math.pow(10, length)) % 10);
                holder += sum;
            }
            return holder;
        }
    }
}
