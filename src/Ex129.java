import java.util.Scanner;

public class Ex129 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        while (true) {
            System.out.print("Base = ");
            int B = in.nextInt();
            System.out.print("Height = ");
            int H = in.nextInt();
            System.out.println("Triangle width = "+String.format("%.1f",((double)B*H/2)));
            System.out.print("Continue? ");
            String str = in.next();
            if (!str.equals("Y")  && !str.equals("y")) {
                break;
            }


        }
    }
}
