import java.util.Scanner;

public class Ex128 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count =0;
        while (true) {
            int a = in.nextInt();
            if (a == 0) {
                break;
            }else if (a%3!=0 && a%5 !=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
