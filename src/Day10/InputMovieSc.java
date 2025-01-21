package Day10;

import java.util.Objects;
import java.util.Scanner;

public class InputMovieSc {
    static final Scanner input = new Scanner(System.in);

    public MovieDTO inputObject(MovieDTO movie){
        System.out.println("영화 제목을 입력하세요.");
        movie.title = input.nextLine();
        System.out.println("영화 개봉일을 입력하세요.");
        movie.startDate = input.nextInt();
        input.nextLine();
        System.out.println("영화 출연 배우를 입력하세요.");
        movie.actor = input.nextLine();
        System.out.println("영화 상영 시간을 입력하세요.");
        movie.runningTime = input.nextLine();
        System.out.println("영화 등급을 입력하세요.");
        movie.grade = input.nextLine();
        System.out.println("영화 장르를 입력하세요.");
        movie.gener = input.nextLine();

        return movie;
    }
}
