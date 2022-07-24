import java.util.Scanner;

public class Ex132 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b =0;
        for (int i = 1; i < a+1; i++) {
            if(i%5==0){
                b+=i;
            }

        }
        System.out.println(b);
    }
}
