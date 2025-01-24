package Day13;

public class SmartPhone extends Phone{

    //wifi 기능추가
    private boolean wifi;

    public SmartPhone(String bander,String model,String color){
        super(bander, model, color);
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi= wifi;
        System.out.println("wifi의 상태를 변경하였습니다.");
        internet();
    }

    public  void internet(){
        System.out.println("인터넷 연결을 연결하였습니다.");
        System.out.println();
    }
}
