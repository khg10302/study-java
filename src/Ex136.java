import java.util.Scanner;

public class Ex136 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int count =0;
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.print(a*count+" ");
        }
    }
}
