package Day9;

public class CatMain {
    public static void main(String[] args) {
        Parentcat momCat = new Parentcat();
        String breed = momCat.breed;
        System.out.println("어미고양이 종은" + breed);
        momCat.methodParentCat();

        //어미 고양이 MomCat1 한마리를 더 생성해보세요.
        Parentcat momCat1 = new Parentcat();
        //momCat1.breed = "점박이";
        momCat1.setBreed("점박이");
//        System.out.println(momCat1.breed);
        momCat1.getBreed();
        momCat1.methodParentCat();

        Kitten kitty1 = new Kitten();
        kitty1.breed = "스핑크스고양이";
        System.out.println(kitty1.breed);
        kitty1.methodParentCat();
        kitty1.methodKitten();
    }
}
