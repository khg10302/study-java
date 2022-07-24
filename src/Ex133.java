import java.util.Scanner;

public class Ex133 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//입력받을 갯수
        int c=0;
        if (a<=100){
        for (int i = 1; i < a+1; i++) {
            int b = in.nextInt();
            c+=b;
        }
        }
        System.out.println(String.format("%.2f",(double)c/a));
    }
}
