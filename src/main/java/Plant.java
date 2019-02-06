public class Plant {

     String name;
     boolean isEatable;
     String whereItCanBeFound;
     int heightInCentimeters;
     int lifeLength;


    boolean isCreatingOxigen(boolean isExposedToSunlight) {
        if (isExposedToSunlight) {
            System.out.println("I breathe out, you breathe in");
            return true;
        } else {
            System.out.println("I`m dead, you`re next");
            return false;
        }
    }


    public void printPlantHeight(){
       System.out.println("The heightInCentimeters of the plant is " + heightInCentimeters + " centimeters");

    }

    public void printPlantDetails() {
        System.out.println("Plant name = " + name);
        if (isEatable) {
            System.out.println("The plant is eatable");
        } else {
            System.out.println("The plant is not eatable");
        }
        System.out.println("This plant can be found growing in " + whereItCanBeFound);
        System.out.println("This plant can grow up to " + heightInCentimeters + " centimeters" );
        System.out.println("This plant can live up to " + lifeLength + " years" );



    }

}


