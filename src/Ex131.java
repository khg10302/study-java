import java.util.Scanner;

public class Ex131 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if(a<b){
            for (int i = a; i < b+1; i++) {
                System.out.print(i+" ");
            }
            }else{
            for (int i = b; i < a+1; i++) {
                System.out.print(i+" ");
            }

        }


    }
}
