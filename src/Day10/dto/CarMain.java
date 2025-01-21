package Day10.dto;

import Day10.dao.CarDAO;
import Day10.dto.CarDTO;

public class CarMain {

    public static void main(String[] args) {
        CarDTO car1 = new CarDTO();
        Tire tire = new Tire();
        tire.setModel("한국타이어");
        CarDTO car2 = new CarDTO("캐스퍼",tire);
        CarDAO cardao = new CarDAO(car2);
        cardao.insert(car2);
        cardao.delete(car2);
        cardao.select(car2);
        cardao.update(car2);
    }
}
