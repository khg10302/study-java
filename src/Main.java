import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);

        /**
         * 빠른 입력
         */

//        int cnt = scanner.nextInt();
//        for (int i = 0; i < cnt; i++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int result = a+b;
//            System.out.println(a+b);
//        }

//        int i1 = Integer.parseInt(in.readLine());
//        for (int i = 0; i < i1; i++) {
//            String[] strings = in.readLine().split(" ");
//            int a = Integer.parseInt(strings[0]);
//            int b = Integer.parseInt(strings[1]);
//            int result = a + b;
//            out.write(String.valueOf(result) +"\n");
//
//        }
//        out.flush();

        /**
         * 아스키 코드
         */
        String str = in.readLine();
        char ch = str.charAt(0);
        int ascii = (int) ch;
        out.write(String.valueOf(ascii));


        out.close();
        in.close();
    }



}


