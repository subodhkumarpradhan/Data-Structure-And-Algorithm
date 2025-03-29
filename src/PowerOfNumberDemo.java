public class PowerOfNumberDemo {

    public static int powerOfNumber(int base, int exp){
        if(exp==0)
            return 1;
        return base * powerOfNumber(base, exp-1);
    }

    public static void main(String[] args) {
        System.out.println(powerOfNumber(2, 4));
    }
}
