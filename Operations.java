import java.util.*;

public class Operations {
    private List<Pet> mainList = new ArrayList<Pet>();

    public List<Pet> getMainList() {
        return mainList;
    }

    public void setMainList(List<Pet> mainList) {
        this.mainList = mainList;
    }

    private String whiteSpace(String txt){
        return txt.replaceAll("\\s","");
    }

    private String checkGender(String gender){
        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m")){
            return new String("M");
        }else if(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f")){
            return  new String("F");
        }else{
            System.out.println("Invalid gender. Please try again...\n\n");
            return new String("fail");
        }
    }

    public void addDog(){
        try{
            Scanner getInput = new Scanner(System.in);


        System.out.println("Dog's name :");
        String name = whiteSpace(getInput.nextLine());
        if(name.equals("")){
            System.out.println("Cannot have an empty name");
            return;
        }

        System.out.println("Dog's gender [ M - F ] :");
        String gender = checkGender(whiteSpace(getInput.nextLine()));
        if(gender.equalsIgnoreCase("fail")){
            return;
        }

        System.out.println("Dog's breed :");
        String breed = whiteSpace(getInput.nextLine());

        System.out.println("Dog's weight :");
        double weight = getInput.nextDouble();
        if(weight <= 0){
            System.out.println("Cannot have a weight lower or equal to 0");
            return;
        }
        System.out.println("Dog's age :");
        double age = getInput.nextDouble();
            if(age <= 0){
                System.out.println("Cannot have an age lower or equal to 0");
                return;
            }

        mainList.add(new Dog(name,age,gender,breed,weight));
        }
        catch(Exception e){
            System.out.println("Error occurred. Please try again...\n\n");
        }
    }

    public void addCat(){
        try{


        Scanner getInput = new Scanner(System.in);

        System.out.println("Cat's name :");
        String name = whiteSpace(getInput.nextLine());
            if(name.equals("")){
                System.out.println("Cannot have an empty name");
                return;
            }

        System.out.println("Cat's gender [ M - F ] :");
            String gender = checkGender(whiteSpace(getInput.nextLine()));
            if(gender.equalsIgnoreCase("fail")){
                return;
            }

        System.out.println("Cat's breed :");
        String breed = whiteSpace(getInput.nextLine());

        System.out.println("Cat's coat color :");
        String coatColor = whiteSpace(getInput.nextLine());

        System.out.println("Cat's age :");
        double age = getInput.nextDouble();
        if(age <= 0 ){
                System.out.println("Cannot have lower or equal to 0");
                return;
            }

        mainList.add(new Cat(name,age,gender,breed,coatColor));
        }
        catch(Exception e){
            System.out.println("Error occurred. Please try again...\n\n");
        }
    }

    public void removeDog(){
        boolean check = true;
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please enter the name of the dog you want to delete :");
        String name = whiteSpace(getInput.nextLine());
        Iterator<Pet> it = mainList.iterator();
        while(it.hasNext()){
            Pet pet = it.next();
            if(pet instanceof Cat){
                continue;
            }
            if(pet.getName().equalsIgnoreCase(name)){
                it.remove();
                System.out.println("Dog with the name "+name+" has been deleted.");
                check = false;
            }
        }

        if(check){
            System.out.println("There is not any dog with the name "+ name + " in your list!");
        }
    }

    public void removeCat(){
        boolean check = true;
        Scanner getInput = new Scanner(System.in);
        System.out.println("Please enter the name of the cat you want to delete :");
        String name = whiteSpace(getInput.nextLine());
        Iterator<Pet> it = mainList.iterator();
        while(it.hasNext()){
            Pet pet = it.next();
            if(pet instanceof Dog){
                continue;
            }
            if(pet.getName().equalsIgnoreCase(name)){
                it.remove();
                System.out.println("Cat with the name "+name+" has been deleted.");
                check = false;
            }
        }

        if(check){
            System.out.println("There is not any cat with the name "+ name + " in your list!");
        }
    }

    public void listDog(){
        boolean check = true;
        postHeader();
        for(Pet pet : mainList){
            if(pet instanceof Dog){
                System.out.println(pet);
                check = false;
            }

        }
        if(check){
            System.out.println("There are no dogs in your list! \n\n");
        }

    }

    public void listCat(){
        boolean check = true;
        postHeader();
        for(Pet pet : mainList){
            if(pet instanceof Cat){
                System.out.println(pet);
                check = false;
            }

        }
        if(check){
            System.out.println("There are no cats in your list! \n\n");
        }
    }

    public void listAll(){
        if(mainList.isEmpty()){
            System.err.println("Your list is empty! \n\n");

            return;
        }
        postHeader();
        for(Pet pet : mainList){
            System.out.println(pet);
        }
    }

    public void showMinMaxAvg(){
        List<Double> dogWeight = new ArrayList<Double>();
        double sumWeight = 0;
        boolean check = true;
        for(Pet pet : mainList){
            if(pet instanceof Dog){
                dogWeight.add(((Dog) pet).getWeight());
                sumWeight += ((Dog) pet).getWeight();
                check = false;
            }

        }
        if(check){
            System.out.println("There are no dogs in your list! \n\n");
            return;
        }

            System.out.println("Min weight of dogs : "+ Collections.min(dogWeight) + " \n " +
                    "Max weight of dogs : "+Collections.max(dogWeight)+"\n " +
                    "Avarage weight of dogs :"+ (sumWeight/dogWeight.size()));


    }

    public void defReload(){
        mainList.clear();
        mainList.add(new Dog("Rex",3,"M","Boxer",30));
        mainList.add(new Cat("Prince",2,"M","Turkish Angora","White"));
        mainList.add(new Dog("Sunny",7,"F","Rottweiler",5));
        mainList.add(new Cat("Mia",4,"F","British Short hair","Gray"));
        mainList.add(new Cat("Coal",1,"M","Birman","Black"));

        System.out.println("Default list is loaded...");

    }

    private void postHeader(){
        String[] headLine = {"NAME", "AGE", "GENDER", "BREED", "COATCOLOR / WEIGHT"};
        System.out.printf(" %25s %30s %30s %30s %30s \n", headLine);
        System.out.printf("________________________________________________________________________________________________" +
                "_____________________________________________________________________________________________________\n");
    }
}
