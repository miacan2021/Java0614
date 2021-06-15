package type;
import parent.Animal;

public class Bird extends Animal{

    private String withFeathers;
    private String canFly;


    public Bird() {
        this.withFeathers = "with feathers";
        this.canFly= "Can";
    }

    public Bird(String withFeathers, String canFly, int height, int weight, String animalType, String bloodType) {
        super(height, weight, animalType, bloodType);
        this.withFeathers = withFeathers;
        this.canFly= canFly;
        
    }

    public String getWithFeathers() {
        return withFeathers;
    }
    public String getcanFly() {
        return canFly;
    }
 
  
    public String showInfo() {
        return "Animal with feathers: " + getWithFeathers() + " /Can fly: " + getcanFly() +
        " /Height: " + getHeight() + " /Weight: " + getWeight() + " /AnimalType: " + getAnimalType() + " /BloodType: " + getBloodType() + ".";
    }

}
