
public abstract class Pet {
    private String name;
    private double age;
    private String breed;
    private String gender;

    public double getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    Pet(){

    }

    Pet(String name, double age, String breed, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }

}
