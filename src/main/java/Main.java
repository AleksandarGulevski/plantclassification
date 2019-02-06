import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Plant pine = new EvergreenTree("Pine", false, "Тhe Mountains", 15000, 50);
        pine.printPlantHeight();
        pine.printPlantDetails();



        Plant pineTwo = null;
        Plant pineThree = null;

        pineTwo = pine;

        pineTwo.printPlantHeight();

        Plant evergreenTreeFruit = new Fruit("Tomato", true, "Gardens", 60, 1);

        evergreenTreeFruit.printPlantDetails();
        evergreenTreeFruit = pineTwo;
        evergreenTreeFruit.printPlantDetails();
        pine.isCreatingOxigen(true);

        Fruit tomato = new Fruit("Tomato", true, "Gardens", 60, 1);
        tomato.printPlantDetails();

        Vegetable carrot = new Vegetable("Carrot", true, 20, 1);
        carrot.printPlantDetails();

EvergreenTree pineFour = new EvergreenTree("Pine", false, 15000, 50);
pineFour.printPlantDetails();

pineFour.printPlantDetails(true);

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(pine);
        plants.add(pineTwo);
        plants.add(pineFour);
        plants.add(tomato);
        plants.add(carrot);

       for (int i = 0; i < plants.size(); i++) {
           plants.get(i).printPlantDetails();


       }

    }
}
