package Day6.Jungol;

import java.util.Scanner;

public class Main_134 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int even = 0;
        int odd = 0;
        int num = 0;

        for(int i = 1;i<=10;i++){
            num = in.nextInt();
            if (num%2==0){
                even++;
            }else {
                odd++;}
            }
        System.out.printf("even : %d%nodd : %d",even,odd);
        }
    }

