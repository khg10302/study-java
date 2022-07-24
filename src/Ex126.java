import java.util.Scanner;

public class Ex126 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt1 = 0, cnt2 = 0;
        while(true){
            int a = in.nextInt();

            if (a==0){
                break;
            }else if(a%2==0){
                cnt1++;
            }else{
                cnt2++;
            }

        }
        System.out.println("odd : "+cnt2);
        System.out.println("even : "+cnt1);
    }
}
