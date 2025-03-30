public class DecimalToBinary {

    public static int convertValue(int n){
        if (n==0)
            return 0;
        return n%2 + (10 * convertValue(n/2));
    }

    public static void main(String[] args) {
        System.out.println(convertValue(13));
    }
}
