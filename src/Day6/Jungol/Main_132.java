package Day6.Jungol;

import java.util.Scanner;

public class Main_132 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int count = 0;
        int sum = 0;

        for(int i = 1;i<=num;i++){
            if(i%5==0){
                sum += i;
        }
    }
        System.out.println(sum);
}
}
