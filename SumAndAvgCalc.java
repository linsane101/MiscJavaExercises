import java.util.Scanner;
public class SumAndAvgCalc {
    public static void main(String[] args) {
        inputThenSumAndAverage();
    }
    public static void inputThenSumAndAverage()
    {
        int sum = 0;
        int avg = 0;
        int counter = 0;
        Scanner obj = new Scanner(System.in);
        while(true)
        {
            counter++;
            System.out.print("Enter a number: ");
            String input = obj.nextLine();
            try {
                int number = Integer.parseInt(input);
                sum += number;
                avg = sum/counter;
            }
            catch (NumberFormatException e)
            {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
