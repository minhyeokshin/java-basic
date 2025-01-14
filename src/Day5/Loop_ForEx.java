package Day5;

public class Loop_ForEx {
    public static void main(String[] args) {

        for (int i = 1; i <= 2;i++) { //행
            for (int j = 1; j <= 2;j++) { //해당 행에 대한 열
                System.out.println("(" + i + "," + j + ")");
            }
        }
        for(int dan = 1 ; dan <= 9 ; dan++ ){
            for(int num = 1; num <= 9; num++){
                System.out.printf("%d * %d = %d%n",dan,num,dan*num);
            }
        }
    }
    }