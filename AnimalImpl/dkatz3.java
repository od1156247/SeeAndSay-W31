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
        return "Wolf";
    }

    @Override
    //I'm not citing my sources
    public String getSound() {
        return "I huff and I puff";
    }

    @Override
    public String getDescription() {
        return "Big and Bad";
    }
}
