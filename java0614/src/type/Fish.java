package type;
import parent.Animal;

public class Fish extends Animal{

    private String whereLiveIn;
    private String hasGills;
    private String releaseElectricCharge;


    public Fish() {
        this.whereLiveIn = "In water";
        this.hasGills = "yes";
        this.releaseElectricCharge = "can";
    }

    public Fish(String whereLiveIn, String hasGills,  String releaseElectricCharge, int height, int weight, String animalType, String bloodType) {
        super(height, weight, animalType, bloodType);
        this.whereLiveIn = whereLiveIn;
        this.hasGills = hasGills;
        this.releaseElectricCharge = releaseElectricCharge;
    }

    public String getWhereLiveIn() {
        return whereLiveIn;
    }
    public String getHasGills() {
        return hasGills;
    }
    public String getReleaseElectricCharge() {
        return releaseElectricCharge;
    }
 
    public String showInfo() {
        return "Where live in: " + getWhereLiveIn() + " /Has gills?: " + getHasGills() + " /Can release electric charge?: " + getReleaseElectricCharge() +
        " /Height:" + getHeight() + " /Weight: " + getWeight() + " /AnimalType: " + getAnimalType() + " /BloodType: " + getBloodType() + ".";
    }

}
