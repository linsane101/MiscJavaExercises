public class SummingFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(7));
    }
    public static int sumFirstAndLastDigit(int number)
    {
        if(number < 0)
        {
            return -1;
        }
        else if(number < 10)
        {
            return number + number;
        }
        else
        {
            int placeholder = number % 10;
            int rem;
            while(number > 0)
            {
                number = number/10;
                if(number < 10)
                {
                    placeholder+=number;
                }
            }
            return placeholder;
        }
    }
}
