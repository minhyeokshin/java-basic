package BookSample;

public class Page207_Sample1 {
    public static void main(String[] args) {
        int[] test = new int[5];

        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;

        for (int i = 0;i< test.length;i++){
            System.out.println((i+1) + "번째 사람의 점수는 " +
                    test[i] + "점 입니다.");
        }
    }
}
