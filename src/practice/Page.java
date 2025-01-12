package practice;

public class Page {
    public static void main(String[] args) {
        double dnum = 160.5;

        System.out.printf("키는 %.1f센티미터입니다.%n",dnum);

        System.out.println("int형 변수에 대입합니다.");

        int inum = (int)dnum;

        System.out.printf("키는 %d센티미터입니다.",inum);
    }
}
