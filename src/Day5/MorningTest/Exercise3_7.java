package Day5.MorningTest;

public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int)(((fahrenheit - 32) * 5 / 9f) * 100 + 0.5) / 100f ;


        System.out.println("Faherenheit:"+fahrenheit);
        System.out.println("Celcius"+celcius);
    }
}
