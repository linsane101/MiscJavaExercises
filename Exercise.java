import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Exercise 14 Multiplication Table of a number
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input the number(table to be calculated: ");
        int input1 = myObj.nextInt();

        for (int i = 0; i <= input1; i++) {
            int product = i * input1;
            System.out.println(input1 + " x " + i + " = " + product);

        }

    }
}
