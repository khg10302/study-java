import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] country = {"Seoul","Washington","Tokyo","Beijing"};
        while(true){
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number?: ");
            int a = in.nextInt();
            if(0 < a && a < 5) {
                System.out.println(country[a - 1]);
            }else{
                System.out.println("none");
                break;
            }
        }
    }
}
