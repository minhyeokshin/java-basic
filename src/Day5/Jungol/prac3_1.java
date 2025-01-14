package Day5.Jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac3_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 100; i++) {
            System.out.printf("number? ");
            String str = br.readLine();
            int number = Integer.parseInt(str);

            if (number > 0) {
                System.out.println("positive integer");
            } else if (number < 0){
                System.out.println("negative number");
            } else
                break;
        }
    }
}
