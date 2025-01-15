package Day6.Jungol;

import java.util.Scanner;

public class Main_543 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int i = 0;

        if (n<=50){
            for (i=1;i<=n;i++){
                if (i%2==0){
                    System.out.printf("%d ",i);
                }
            }
        }
        }
    }

