package BookSample;

public class Page217_Sample5 {
    public static void main(String[] args) {
        int[] test1 = new int[3];

        System.out.println("test1을 선언했습니다.");
        System.out.println("배열 요소를 생성했습니다.");

        test1[0] = 80;
        test1[1] = 60;
        test1[2] = 22;

        int[] test2;
        System.out.println("test2를 선언했습니다.");

        test2 = test1;

        for (int i = 0;i<3;i++){
            System.out.println("test1(이)가 가리키는 " + (i+1) +
                    "번째 사람의 점수는 " + test1[i] + "점입니다.");
        }

        for (int i = 0;i<3;i++){
            System.out.println("test2(이)가 가리키는 " + (i+1) +
                    "번째 사람의 점수는 " + test2[i] + "점입니다.");
        }
    }
}
