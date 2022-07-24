import java.util.Scanner;

public class Ex546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        int count = 0;
            for (int i = 0; i < a; i++) {
                int b = in.nextInt();
                sum+=b;
                count++;
            }
        double avg = (double) sum / count;
        System.out.println("avg : "+String.format("%.1f", avg));
        if (avg >= 80) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

}
