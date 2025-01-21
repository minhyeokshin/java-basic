package Car.CarDAO;

import Car.CarDTO.CarDTO;

public class CarDAO {
    private CarDTO car;

    public CarDAO(CarDTO car){
        this.car = car;
    }

    public void  speed(CarDTO car){
        System.out.println(car.getModel() + " 현재 스피드 : " + car.getSpeed());
    }
}
