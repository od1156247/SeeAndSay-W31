package SeeAndSay.AnimalImpl;

import SeeAndSay.Animal;
import SeeAndSay.Talker;

public class dkatz3 extends Animal implements Talker {
    @Override
    public String getAuthor() {
        return "David Katz";
    }

    @Override
    public String getAnimalName() {
        return "Chameleon";
    }

    @Override
    //I'm not citing my sources
    public String getSound() {
        return "I can change colors, eat insects, and commit cannibalism.";
    }

    @Override
    public String getDescription() {
        return "Very lizard";
    }
}
