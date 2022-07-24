import java.util.Scanner;

public class Ex135 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum=0;
        int count =0;
        if(a<b){
            for (int i = a; i < b+1; i++) {
                if(i%3==0 && i%5==0){
                sum+=i;
                count++;
                }else if(i%5==0){
                    sum+=i;
                    count++;
                }else if(i%3==0){
                    sum+=i;
                    count++;
                }
            }
        }else{
            for (int i = b; i < a+1; i++) {
                if(i%3==0 && i%5==0){
                    sum+=i;
                    count++;
                }else if(i%5==0){
                    sum+=i;
                    count++;
                }else if(i%3==0){
                    sum+=i;
                    count++;
                }
            }
        }
        System.out.println("sum : "+sum);
        System.out.println("avg : "+String.format("%.1f",(double)sum/count));
    }
}
