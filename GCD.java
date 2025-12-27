public class GCD {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(50,15));
    }
    public static int getGreatestCommonDivisor(int first, int second)
    {
        boolean firstNumber = first < 10;
        boolean secNumber = second < 10;
        if(firstNumber || secNumber)
        {
            return -1;
        }
        int placeholder = 0;
        for(int i = first; i >= 0; i--)
        {
            if((first % i == 0) && (second % i == 0))
            {
                placeholder = i;
                break;
            }
        }
        return placeholder;
    }
}
