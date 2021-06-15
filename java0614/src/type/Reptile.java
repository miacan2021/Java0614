package type;
import parent.Animal;

public class Reptile extends Animal{

    private String skinType;
    private String boneColor;
    private String eggShelledType;

    public Reptile() {
        this.skinType = "Dry Skin";
        this.boneColor = "Black";
        this.eggShelledType = "Soft";
    }

    public Reptile(String skinType, String boneColor, String eggShelledType, int height, int weight, String animalType, String bloodType) {
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.boneColor = boneColor;
        this.eggShelledType = eggShelledType;
    }

    public String getSkinType() {
        return skinType;
       
    }
    public String getBoneColor() {
        return boneColor;
    }
    public String getEggShelledType() {
        return eggShelledType;
    }
 
    public String showInfo() {
        return " SkinType: " + getSkinType() + " /BoneColor: " + getBoneColor() + " /EggShelledType: " + getEggShelledType() +
        " /Height: " + getHeight() + " /Weight: " + getWeight() + " /AnimalType: " + getAnimalType() + " /BloodType: " + getBloodType() + ".";
    }
 
}
