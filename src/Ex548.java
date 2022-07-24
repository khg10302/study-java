public class Ex548 {
    public static void main(String[] args) {
        for (int i = 2; i < 5   ; i++) {
            int j;
            System.out.println();
            for (j = 1; j < 6; j++) {
                System.out.printf("%d %d %-d", i, j, i * j);
            }
        }
    }
}
