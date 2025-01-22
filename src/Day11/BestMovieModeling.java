//package Day11;
//
//import java.util.Scanner;
//
//public class BestMovieModeling {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("입력할 영화의 총개수를 입력");
//        int movieTotal = in.nextInt();
//        System.out.println("각 영화당 상세정보의 개수를 입력하세요.");
//        int movieInfo = in.nextInt();
//
//        //레벨업 : 5개의 영화를 배열로 관리하고싶다. movieArray를 만들어 5개의 영화정보를 저장.
//        MovieVO[][] movieArray;
//        movieArray = new MovieVO[movieTotal][movieInfo];
//
//        //3개의 영화를 상세정보목록의 개수는 3개(title,actor,grade)
//
//        //정보를 입력받고 해당 영화정보의 내용이 자동으로 movieArray에 할당되도록 만들어주세요
//
//        for(int i = 0;i<movieArray.length;i++) {
//            MovieVO movie = new MovieVO();
//            for (int j = 0; j < 3; j++) {
//
//                if (j == 0) {
//                    System.out.println("영화 제목을 입력하세요.");
//                    movieArray[i][j] = movie.setTitle();
//                    movie.setTitle(in.next());
//                } else if (j == 1) {
//                    System.out.println("영화 배우를 입력하세요.");
//                    movieArray[i][j] = movie.setActor();
//                    movie.setActor(in.next());
//                } else if (j == 2) {
//                    System.out.println("런닝 타임을 입력허세요.");
//                   movieArray[i][j] = movie.setRunningTime();
//                    movie.setRunningTime(in.next());
//                }
//            }
//        }
//
//                for (int ii = 0;ii<movieTotal;ii++){
//                    for(int jj = 0;jj<movieInfo;jj++){
//                        System.out.println(movie.get);
//
//                    }
//                }
//
//
//
//
//
//
//        MovieVO Avatar = new MovieVO("아바타","12세","액션");
//        System.out.println(Avatar.toString());
//        Avatar.setStartDate(20221214);
//        Avatar.setActor("제이크설리");
//        Avatar.setRunningTime("192");
//
//
//        System.out.println("++++++++++" + Avatar.getTitle() + "++++++++++");
//        System.out.printf("제목 : %s %n",Avatar.getTitle());
//        System.out.printf("배우 : %s %n",Avatar.getActor());
//        System.out.printf("런닝타임 : %s %n",Avatar.getRunningTime());
//        System.out.printf("등급 : %s %n",Avatar.getGrade());
//    }
//}
