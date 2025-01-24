package Day13.Home;


class Tv {
    String color;
    boolean power;
    int channel;

    public Tv(String color, boolean power, int channel){
        this.color = color;
        this.power = power;
        this.channel = channel;
    }

    void power() {
        if (power == true) power = false;
        if (power == false) power = true;
    }


    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }


    void print () {
        System.out.println("color : " + color + "\tpower : " + power + "\tchannel1 : " + channel);
    }


}


public class Prob1 {

    public static void main(String[] args) {
        Tv t = new Tv("black",false,0);
        t.print();  // 첫번째 출력문
        t.power();
        t.print();  // 두번째 출력문
        t.channelUp();
        t.channelUp();
        t.print(); // 세번째 출력문

    }
}
