
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            int a = in.nextInt();
            if(a ==-1){
                break;
            }else if (a%3==0){
                System.out.println(a/3);
            }
        }



    }
}
