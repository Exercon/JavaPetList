import java.util.*;

public class Test{

    Operations operations;

    public Test(){
        operations = new Operations();
        while(true) {
            openMenu();
        }
    }

    private void openMenu(){
        Scanner getInput = new Scanner(System.in);
        System.out.println(" 1- Add Dog \n 2- Add Cat \n " +
                "3- Remove dog \n 4- Remove cat \n 5- List dogs \n 6- List cats \n " +
                "7- List all pets \n 8- Show min,max and average weight of dogs \n 9- Reload default testing list" +
                "\n 0- Quit \n Please make a choice [1-9] \n ");
        switch (getInput.nextInt()){
            case 1:
                operations.addDog();
                break;
            case 2:
                operations.addCat();
                break;
            case 3:
                operations.removeDog();
                break;
            case 4:
                operations.removeCat();
                break;
            case 5:
                operations.listDog();
                break;
            case 6:
                operations.listCat();
                break;
            case 7:
                operations.listAll();
                break;
            case 8:
                operations.showMinMaxAvg();
                break;
            case 9:
                operations.defReload();
                break;
            case 0:
                System.exit(0);
                break;

            default:
                System.err.print("An error occured. Please try again...");

        }

    }







}
