package Day13;


public class PhoneMain extends Phone {

    public static void main(String[] args) {
        String message = "Shin";
        //Phone 타입으로 유선전화를 생성하여
        Phone phone = new Phone();
        //1. 전화를건다
        phone.call();
        //2. 전화를 받는다.
        phone.callrecived();
        //3. 메세지를 전송한다.
        phone.sendvoice(message);
        //4. 메세지를 수신한다.
        phone.recieve(message);
        //5. 전화를 끊는다.
        phone.finish();

        System.out.println("---------------------");
        System.out.println();


        message = "Kim";
        //SmartPhone을 생성하여
        SmartPhone smartPhone = new SmartPhone("애플","아이폰15","White");
        System.out.println("회사 : " +smartPhone.getBander() + "\t모델 : " + smartPhone.getModel() + "\t컬러 : " + smartPhone.getColor());
        //0. wifi를 연결하고 인터넷을 켠다.
        smartPhone.setWifi(true);
        //1. 전화를건다
        smartPhone.call();
        //2. 전화를 받는다.
        smartPhone.recieve(message);
        //3. 메세지를 전송한다.
        smartPhone.sendmessage(message);
        //4. 메세지를 수신한다.
        smartPhone.recieve(message);
        //5. 전화를 끊는다.
        smartPhone.finish();


    }
}
