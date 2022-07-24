import java.util.Scanner;

public class Ex545 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int co1 =0;
        int co2 =0;
        for (int i = 0; i <10 ; i++) {
            int a = in.nextInt();
            if (a % 3 == 0) {
                co1++;
            }
            if (a % 5 == 0) {
                co2++;
            }
        }
        System.out.println("Multiples of 3 : "+co1);
        System.out.println("Multiples of 5 : "+co2);
    }
}
