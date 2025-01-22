package Day11;

import java.util.Scanner;

public class BestMovie {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("입력할 영화의 총개수를 입력");
        int movieTotal = in.nextInt();
        System.out.println("각 영화당 상세정보의 개수를 입력하세요.");
        System.out.println("1.제목 2.상영시간 3.개봉일");
        System.out.println("4.주인공 5.장르 6.등급");
        int movieInfo = in.nextInt();


        MovieVO[] movieArray = new MovieVO[movieTotal];


        for (int i = 0;i<movieTotal;i++){
            MovieVO movie = new MovieVO();

            if (movieInfo>=1){
                System.out.printf("%d번 영화 제목을 입력하세요.%n",(i+1));
                movie.setTitle(in.next());
            }
            if(movieInfo>=2){
                System.out.printf("%d번 영화 상영시간을 입력하세요.%n",(i+1));
                movie.setRunningTime(in.next());
            }
            if (movieInfo>=3){
                System.out.printf("%d번 영화 개봉일을 입력하세요.%n",(i+1));
                movie.setStartDate(in.nextInt());
            }
            if (movieInfo>=4){
                System.out.printf("%d번 영화 주인공을 입력하세요.%n",(i+1));
                movie.setActor(in.next());
            }
            if (movieInfo>=5){
                System.out.printf("%d번 영화 장르을 입력하세요.%n",(i+1));
                movie.setGener(in.next());
            }
            if (movieInfo>=6){
                System.out.printf("%d번 영화 등급을 입력하세요.%n",(i+1));
                movie.setGrade(in.next());
            }

            movieArray[i] = movie;
        }

        for (int i =0;i<movieTotal;i++){
            if(movieInfo>=1){
            System.out.printf("%d번 제목 : %s%n",(i+1),movieArray[i].getTitle());
            }
            if(movieInfo>=2) {
                System.out.printf("%d번 상영시간 : %s%n",(i+1),movieArray[i].getRunningTime());
            }
            if(movieInfo>=3) {
                System.out.printf("%d번 개봉일 : %d%n", (i+1),movieArray[i].getStartDate());
            }
            if(movieInfo>=4) {
                System.out.printf("%d번 주인공 : %s%n", (i+1),movieArray[i].getActor());
            }
            if(movieInfo>=5) {
                System.out.printf("%q번 장르 : %s%n", (i+1),movieArray[i].getGener());
            }
            if(movieInfo>=6) {
                System.out.printf("%d번 등급 : %s%n",(i+1), movieArray[i].getGrade());
            }

        }

    }
}
