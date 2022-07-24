import java.util.Scanner;

public class Ex137 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count=2;
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(i*j+" ");//가로
            }
            System.out.println();
        }
    }
}
