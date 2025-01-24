package Day13.StarCraft;

class Common{
    void Attack(){
        System.out.println("공격한다.");
    }
}

class Terrran extends Common {}

class Protoss extends Common {
    void Telportaion(){
        System.out.println("텔레포트 사용");
    }
}

class Zerg extends Common {
    void Artack(){
        System.out.println("찌르기 공격한다.");
    }
}

class Zerg1 extends Zerg {
    @Override
    void Artack() {
        super.Attack();
    }
}


public class StarcraftMain {
    public static void main(String[] args) {
        Zerg1 zerg1 = new Zerg1();
        System.out.println("zerg1 출력");
        System.out.printf("Attack : ");
        zerg1.Attack();
        System.out.printf("Artack : ");
        zerg1.Artack();
        System.out.printf("zerg1은 기본공격만 가능합니다.");
        System.out.println("찌르기 공격이 불가합니다.");

        System.out.println("------------------------");

        Zerg zerg = new Zerg();
        System.out.println("zerg 출력");
        System.out.printf("Attack : ");
        zerg.Attack();
        System.out.printf("Artack : ");
        zerg.Artack();

        System.out.println("------------------------");

        Protoss protoss = new Protoss();
        System.out.println("protoss 출력");
        System.out.printf("Attack : ");
        protoss.Attack();
        System.out.printf("텔레포트 : ");
        protoss.Telportaion();

        System.out.println("------------------------");

        Terrran terrran = new Terrran();
        System.out.println("terran 출력");
        System.out.printf("Attack : ");
        terrran.Attack();
        System.out.printf("terran은 기본공격만 가능합니다.");

    }
}
