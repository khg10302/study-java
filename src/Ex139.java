import java.util.Scanner;

public class Ex139 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 1; i <=9 ; i++) {
            for (int j = a; j>=b; j--) {
                System.out.print(j+" * "+i+" = "+i*j + "   ");
            }
            System.out.println();
        }

    }
}
