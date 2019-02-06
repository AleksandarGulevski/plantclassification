class EvergreenTree extends WildPlant {

    private static final String WHERE_IT_CAN_BE_FOUND_DEFAULT = "Forest";
    private static final int DIVIDER_FOR_HEIGHT_DEFAULT = 100;

     EvergreenTree (String name, boolean isEatable, String whereItCanBeFound,int heightInCentimeters, int lifeLength) {
        this.name = name;
        this.isEatable = isEatable;
        this.whereItCanBeFound = whereItCanBeFound;
        this.heightInCentimeters = heightInCentimeters;
        this.lifeLength = lifeLength;
    }

    EvergreenTree (String name, boolean isEatable, int heightInCentimeters, int lifeLength) {
        this(name, isEatable,  WHERE_IT_CAN_BE_FOUND_DEFAULT, heightInCentimeters,  lifeLength);

    }

    EvergreenTree (String name, int heightInCentimeters, int lifeLength){
       this ( name,false,  heightInCentimeters,  lifeLength);
    }

    public void printPlantHeight(){
        double heightInMeters = (double) heightInCentimeters /DIVIDER_FOR_HEIGHT_DEFAULT;
        System.out.println("The heightInCentimeters of the plant is " + heightInMeters + " meters");
// i am overriding this method to display the height of evergreen trees in meters instead of centimeters
    }

    public void printPlantDetails() {
        double heightInMeters = (double) heightInCentimeters /DIVIDER_FOR_HEIGHT_DEFAULT;
        System.out.println("Plant name = " + name);
        if (isEatable) {
            System.out.println("The plant is eatable");
        } else {
            System.out.println("The plant is not eatable");
        }
        System.out.println("This plant can be found growing in " + whereItCanBeFound);
        System.out.println("This plant can grow up to " + heightInMeters + " meters" );
        System.out.println("This plant can live up to " + lifeLength + " years" );
// this method is also overridden to show the height of evergreen tree in meters
    }

    public void printPlantDetails(boolean isInMeters) {
         double heightOfPlant = heightInCentimeters;
         if (isInMeters) {
             heightOfPlant = (double) heightInCentimeters / DIVIDER_FOR_HEIGHT_DEFAULT;
         }


        System.out.println("Plant name = " + name);
        if (isEatable) {
            System.out.println("The plant is eatable");
        } else {
            System.out.println("The plant is not eatable");
        }
        System.out.println("This plant can be found growing in " + whereItCanBeFound);

        System.out.println("This plant can grow up to " + heightOfPlant + " meters" );
        System.out.println("This plant can live up to " + lifeLength + " years" );
// this method is also overridden to show the height of evergreen tree in meters
    }
}
