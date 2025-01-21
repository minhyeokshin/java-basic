package Day10;

import java.util.Scanner;

// 실행클라스
// 데이터보관 클라스
public class MovieMain {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        MovieDTO movie1 = new MovieDTO();
        movie1.title = "검은수녀들";
        movie1.startDate = 20250110;
        movie1.actor = "송혜교";
        movie1.runningTime = "150분";
        movie1.grade = "15세 이상";
        movie1.gener = "공포";

        //히트맨2의 정보를 참조하여 영화를 생성

        MovieDTO movie2 = new MovieDTO();
        movie2.title ="히트맨2";
        movie2.startDate = 20250122;
        movie2.actor = "권상우";
        movie2.runningTime = "118분";
        movie2.grade = "15세 이상";
        movie2.gener = "코미디";

        System.out.println(movie1.title);
        System.out.println();
        System.out.println();
        System.out.println(movie1.actor);
        System.out.println(movie1.gener +" " + movie1.grade + "," + movie1.runningTime);
        System.out.println("개봉:" + movie1.startDate);
        System.out.println();
        System.out.println();

        System.out.println(movie2.title);
        System.out.println();
        System.out.println();
        System.out.println(movie2.actor);
        System.out.println(movie2.gener +" " + movie2.grade + "," + movie2.runningTime);
        System.out.println("개봉:" + movie2.startDate);

        //영화정보를 출력할때 마다 반복적인 문장의 묶음,PringMovie 메서드로 리팩토링하세요
    }


}
