
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //exercise -> count up to 10
        //for(int i = 1; i <= 10; i++) {
            //System.out.println(i);
        //}

        System.out.println("Input the 5 numbers: ");
        Scanner myObj = new Scanner(System.in);
        int input1 = myObj.nextInt();
        Scanner myObj2 = new Scanner(System.in);
        int input2 = myObj2.nextInt();
        Scanner myObj3 = new Scanner(System.in);
        int input3 = myObj3.nextInt();
        Scanner myObj4 = new Scanner(System.in);
        int input4 = myObj4.nextInt();
        Scanner myObj5 = new Scanner(System.in);
        int input5 = myObj5.nextInt();
        int sum = input1 + input2 + input3 + input4 + input5;
        System.out.println("The sum of inputs are: " + sum);
        System.out.println("The average: " + (sum/5));
        }
    }
