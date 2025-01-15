package Day6.Jungol;

public class Main_548 {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;


        for (i = 2; i <= 4; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.printf("%d * %d = %d  ",i,j,i*j);
            }
            System.out.println();
        }
    }
}
