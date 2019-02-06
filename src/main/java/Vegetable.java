 class Vegetable extends CultivatedPlant {

    public Vegetable (String name, boolean isEatable, int heightInCentimeters, int lifeLength) {
       whereItCanBeFound = "Gardens"; // i am setting this variable to be default for all vegetables
        this.name = name;
        this.isEatable = isEatable;
        this.heightInCentimeters = heightInCentimeters;
        this.lifeLength = lifeLength;
    }
}
