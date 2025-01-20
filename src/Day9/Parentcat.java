package Day9;

class Parentcat {
    private String breed = "샴고양이";
    void methodParentCat(){
        System.out.println("어미고양이");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
class Kitten extends Parentcat{
    void methodKitten(){
        System.out.println("아기고양이");
    }
}
