import java.util.Scanner;
public class Challenge {
    public static void main(String []args)
    {
        double value1 = 20.00, value2 = 80.00;
        double total = (value1 + value2) * 100;
        System.out.println("My values total:" + total);
        double remainder = total % 40;
        System.out.println("The remainder: " + remainder);
        if(remainder == 0)
        {
            boolean output = true;
            System.out.println(output);
        }
        else
        {
            boolean output = false;
            System.out.println(output);
        }
    }
}
