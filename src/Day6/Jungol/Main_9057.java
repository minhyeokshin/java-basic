package Day6.Jungol;

public class Main_9057 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        for (int ii = 3; ii >= 1; ii--) {
            for (int jj = 1; jj <= ii; jj++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
