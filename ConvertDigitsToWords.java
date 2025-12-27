import java.util.Scanner;
public class ConvertDigitsToWords {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input Number: ");
        int input = obj.nextInt();
        numberToWords(input);
    }
    // convert number to words
    public static void numberToWords(int number)
    {
        if(number < 0)
        {
            System.out.println("Invalid Value");
        }
        if(number == 0)
        {
            System.out.println("Zero");
        }
        int placeholder = 0;
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse(number));
        number = reverse(number);
        while(number != 0)
        {
            placeholder = number%10;
            switch(placeholder)
            {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }
            number= number/10;

        }
        for(int i = 0; i < leadingZeroes; i++)
        {
            System.out.println("Zero");
        }
    }
    // reverses order of numbers so when number is called upon by numberToWords method, result will come out in correct order
    public static int reverse(int number)
    {

        int placeholder = 0;
        int rem;
        while(number != 0)
        {
            rem = number%10;
            placeholder = (placeholder * 10) + rem;
            number /= 10;
        }
        return placeholder;
    }
    //count digits of inputted number
    public static int getDigitCount(int number)
    {
        if(number < 0)
        {
            return -1;
        }
        if(number == 0)
        {
            return 1;
        }
        int counter = 0;
        while(number > 0)
        {
            counter++;
            number/=10;
        }
        return counter;
    }
}
