package Car.CarDTO;

import Car.CarDAO.CarDAO;
import Car.CarDTO.CarDTO;
import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car.CarDTO.CarDTO car = new CarDTO("캐스퍼", "신민혁" ,10);
        CarDAO cardao = new CarDAO(car);
        cardao.speed(car);

        while (true){

            System.out.println("차 속도 1 증가하려면 +를 입력하세요.");
            System.out.println("차 속도 1 감소하려면 -를 입력하세요.");
            String num = in.next();

            if (num.equals("+")){
                car.setSpeed(car.getSpeed()+1);
                System.out.println(car.getModel() + " 현재 스피드 : " + car.getSpeed());
            }
            else if (num.equals("-")){
                car.setSpeed(car.getSpeed()-1);
                System.out.println(car.getModel() + " 현재 스피드 : " + car.getSpeed());
            }
            if (car.getSpeed()==0){
                System.out.println("차량 속도가 0입니다.");
                System.out.println("stop");
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}

