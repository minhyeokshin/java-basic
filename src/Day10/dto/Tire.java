package Day10.dto;

public class Tire {     // Tire 옆에 extends Object 생략되어있음
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "model='" + model + '\'' +
                '}';
    }

    private String model;

}
