public class SumOfDigitDemo {
    // How to find sum of digits of a positive integer number using recursion ?

    public static int sumOfDigit(int n){
        if (n==0)
            return 0;
        return n%10 + sumOfDigit(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(123));
    }
}
