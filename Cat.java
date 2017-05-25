
public class Cat extends Pet {

    private String coatColor;

    public Cat(String name, double age, String gender, String breed, String coatColor){
        super(name,age,gender,breed);
        this.coatColor = coatColor;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public String toString() {
        String[] inside = {getName(),String.valueOf(getAge()),getGender(),getBreed(),coatColor};
        String s = String.format(" %25s %30s %30s %30s %30s\n", inside);
        return s;
    }
}
