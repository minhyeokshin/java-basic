package Day8.ioEx;

public class prac_7 {
    public static void main(String[] args) {


        int[] array = {1, 5, 3, 8, 2};
        int max = 0;

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.printf("최댓값 : %d%n",max);
    }
}
