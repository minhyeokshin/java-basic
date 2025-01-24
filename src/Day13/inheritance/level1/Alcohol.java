package Day13.inheritance.level1;

public class Alcohol extends Drink {
    private double alcper;
    private  String name;
    private int price;
    private int count;
    private int TotalPrice;

    public int getTotalPrice() {
        return price*count;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }

    public double getAlcper() {
        return alcper;
    }

    public void setAlcper(double alcper) {
        this.alcper = alcper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Alcohol(String name, int price, int count,double alcper) {
        super(name, price, count);
        this.name = name;
        this.price = price;
        this.count = count;
        this.alcper = alcper;
    }

    static void printTitle() {
        System.out.printf("상품명(도수[%%])\t단가\t수랑\t금액%n");
    }



    void printData() {
        System.out.printf("%s(%.1f)\t%d\t%d\t%d%n", name, alcper, price, count, (price * count));
    }
}



