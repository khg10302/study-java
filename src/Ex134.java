import java.util.Scanner;

public class Ex134 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int even =0;
        int odd=0;
        for (int i = 0; i < 9+1; i++) {
            int a = in.nextInt();
            if(a%2==0){
                even++;
            }if(a%2!=0) {
                odd++;
            }
        }
        System.out.println("even : "+even);
        System.out.println("odd : "+odd);

    }
}
