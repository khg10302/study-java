import java.util.Scanner;

public class Ex138 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("("+i+", "+j+") ");
            }
            System.out.println();
            
        }
    }
}
