public class ConfirmingPerfectNumbers {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber(int number)
    {
        if(number < 1)
        {
            return false;
        }
        int placeholder = 0;
        for(int i = 1; i < number; i++)
        {
            if(number % i == 0)
            {
                placeholder += i;
            }

        }
        return placeholder == number;
    }
}
