package Day10.dao;

import  Day10.dto.CarDTO;

public class CarDAO {
    private CarDTO car;

    public CarDAO(CarDTO car){
        this.car = car;
    }

    public void  insert(CarDTO car){
        System.out.println(car.getModel() + "DB에 car 1대 정보 입력" + car.getTire().toString());
    }
    public void  delete(CarDTO car){
        System.out.println(car.getModel() + "DB에 car 1대 정보 삭제");
    }
    public void  select(CarDTO car){
        System.out.println(car.getModel() + "DB에 car 1대 정보 조회");
    }
    public void  update(CarDTO car){
        System.out.println(car.getModel() + "DB에 car 1대 정보 갱신");
    }
}
