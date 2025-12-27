public class hasSharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(10,15));
    }
    public static boolean hasSharedDigit(int firstNum, int secondNum)
    {
        boolean first = (firstNum >= 10) && (firstNum <= 99);
        boolean second = (secondNum >= 10) && (secondNum <= 99);
        int lastDigitFirstNum = firstNum%10;
        int lastDigitSecNum = secondNum%10;
        int firstDigitFirstNum = firstNum/10;
        int firstDigitSecNum = secondNum/10;
        if(first && second)
        {
            boolean firstEquation = (lastDigitFirstNum == lastDigitSecNum) || (lastDigitFirstNum == firstDigitSecNum);
            boolean secondEquation = (firstDigitFirstNum == lastDigitSecNum) || (firstDigitFirstNum == firstDigitSecNum);
            return firstEquation || secondEquation;
        }
        else
        {
            return false;
        }

    }
}
