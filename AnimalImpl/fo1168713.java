package SeeAndSay.AnimalImpl;

import SeeAndSay.Animal;
import SeeAndSay.Talker;

public class fo1168713 extends Animal implements Talker {

    @Override
    public String getAuthor() {
        return "Lordson Fongyi";
    }

    @Override
    public String getAnimalName() {
        return "Lion";
    }

    @Override
    //I'm not citing my sources
    public String getSound() {
        return "Roar and Roar";
    }

    @Override
    public String getDescription() {
        return "Strong and Bad";
    }
}

