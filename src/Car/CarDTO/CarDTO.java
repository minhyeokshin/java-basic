package Car.CarDTO;

import Day10.dto.Tire;

public class CarDTO {

    private String model;//null 초기화
    private String name;
    private int speed;  // 0 초기화

    @Override
    public String toString() {
        return "CarDTO{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarDTO() {
    }

    public CarDTO(String model, String name, int speed) {
        this.model = model;
        this.name = name;
        this.speed = speed;


    }
}
