package Day13;

public class Phone {

    //멤버 변수
    private String bander;
    private String model;
    private String color;

    public String getBander() {
        return bander;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Phone(){}
    public Phone(String bander,String model,String color){
        this.bander = bander;
        this.model = model;
        this.color = color;
    }

    //전화를 건다
    public void call(){
        System.out.println("전화를 건다.");
        System.out.println();
    }

    //메세지 전송한다.
    public void sendvoice(String message){
        System.out.println(message + "님 안녕하세요");
        System.out.println("메세지를 전송하였습니다.");
        System.out.println();
    }
    //전송된음성을 상대방이 들을 수 있다.
    public void recieve(String message){
        System.out.println(message + "님에게 메세지를 수신하였습니다.");
        System.out.println();
    }
    //벨이 울리며 전화를 받는다.
    public void callrecived(){
        System.out.println("전화를 받다");
        System.out.println();
    }
    //전화를 끊는다.
    public void finish(){
        System.out.println("전화를 끊습니다.");
        System.out.println();
    }

    //메세지를 전송한다.
    public void sendmessage(String message){
        System.out.println(message + "에게 메세지를 전송하다.");
        System.out.println();
    }
}
