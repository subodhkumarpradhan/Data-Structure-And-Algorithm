public class Main {

    static void openRussianDoll(int doll){
        if (doll==1){
            System.out.println("Doll: " + doll);
            System.out.println("All dolls are opened");
        }else {
            System.out.println("Doll: " + doll);
            openRussianDoll(doll-1);
        }
    }

    public static void main(String[] args) {
        openRussianDoll(10);
    }
}
