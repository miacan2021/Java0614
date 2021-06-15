  
import type.Reptile;
import type.Bird;
import type.Fish;

public class Main {
    public static void main(String[] args) {
        Crocodile crocodile = new Crocodile();
        Crocodile2 crocodile2 = new Crocodile2();
        Eel eel = new Eel();
        Eel2 eel2 = new Eel2();
        Eagle eagle = new Eagle();
        Eagle2 eagle2 = new Eagle2();
    }  
    
}

class  Crocodile {
    public Crocodile() {
        Reptile crocodile = new Reptile("Dry Skin", "White", "Hard", 150, 100, "Reptile", "A");
        System.out.println("Type of shelled eggs: " + crocodile.getEggShelledType());
        System.out.println("Crocodile= " + crocodile.showInfo());
     }
} 
class  Crocodile2 {
    public Crocodile2() {
        Reptile crocodile2 = new Reptile();
        System.out.println("Type of shelled eggs: " + crocodile2.getEggShelledType());
        System.out.println("Crocodile2= " + crocodile2.showInfo());
     }
} 

class Eel {
    public Eel() {
        Fish eel = new Fish("In river", "No", "Yes", 150, 100, "Fish", "O");
        System.out.println("Release electric charge:" + eel.getReleaseElectricCharge());
        System.out.println("Eel= " + eel.showInfo());
    }
}
class Eel2 {
    public Eel2() {
        Fish eel2 = new Fish();
        System.out.println("Release electric charge:" + eel2.getReleaseElectricCharge());
        System.out.println("Eel2= " + eel2.showInfo());
    }
}

class Eagle {
    public Eagle() {
        Bird eagle = new Bird("Yes", "No", 30, 10, "eagle", "AB");
        System.out.println("Eagle= " + eagle.showInfo());
    }
}
class Eagle2 {
    public Eagle2() {
       Bird eagle2 = new Bird();
        System.out.println("Eagle2= " + eagle2.showInfo()); 
    }

}




    