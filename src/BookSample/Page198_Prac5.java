package BookSample;

//소수 : 1또는 그 수로만 나누어지는수

import java.util.Scanner;

public class Page198_Prac5 {
    public static void main(String[] args) {
        System.out.println("2 이상의 정수를 입력하십시오.");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 0;
        int j = 0;

        while (true){

        i++;
            if (i==(num+1)){
                break;
            }
            if (num%i==0){
                j++;
            }
        }
        if (j==2){
            System.out.printf("%d(은)는 소수입니다.",num);
        }
        else {
            System.out.printf("%d(은)는 소수가아닙니다.",num);
        }

        }
    }

