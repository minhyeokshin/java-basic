package Day13.inheritance.level1;



public class Drink {

    private String  name;
    private int price;
    private int count;
    private int TotalPrice;

    public int getTotalPrice() {
        return price*count;
    }

    public void setTotalPrice(int totalPrice) {
        TotalPrice = totalPrice;
    }

    public Drink(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    static void printTitle(){
        System.out.printf("상품명\t단가\t수랑\t금액%n");
    }

    void printData(){
        System.out.printf("%s\t%d\t%d\t%d%n",name,price,count,(price*count));
    }

}
