
public class Dog extends Pet{

        private double weight;

        public Dog(String name, double age, String gender, String breed, double weight){
            super(name,age,gender,breed);
            this.weight = weight;
        }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        String[] inside = {getName(),String.valueOf(getAge()),getGender(),getBreed(),String.valueOf(weight)};
        String s = String.format(" %25s %30s %30s %30s %30s\n", inside);
        return s;
    }
}
