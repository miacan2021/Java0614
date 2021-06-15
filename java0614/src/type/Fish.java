package type;
import parent.Animal;

public class Fish extends Animal{

    private String whereLiveIn;
    private String hasGills;

    public Fish() {
        this.whereLiveIn = "In water";
        this.hasGills = "yes";
      
    }

    public Fish(String whereLiveIn, String hasGills, int height, int weight, String animalType, String bloodType) {
        super(height, weight, animalType, bloodType);
        this.whereLiveIn = whereLiveIn;
        this.hasGills = hasGills;
      
    }

    public String getWhereLiveIn() {
        return whereLiveIn;
    }
    public String getHasGills() {
        return hasGills;
    }
 
    public String showInfo() {
        return "Where live in: " + getWhereLiveIn() + " /Has gills?: " + getHasGills() +
        " /Height:" + getHeight() + " /Weight: " + getWeight() + " /AnimalType: " + getAnimalType() + " /BloodType: " + getBloodType() + ".";
    }

}
