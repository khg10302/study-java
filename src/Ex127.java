import java.util.Scanner;

public class Ex127 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int a = in.nextInt();
            if (0<=a && a <=100) {
                sum += a;
                count++;
            }else{
                break;
            }

        }
        System.out.println("sum : "+sum);
        System.out.println("avg : "+String.format("%.1f", (double)sum/count));

    }

}
