package SeeAndSay;

public abstract class Animal implements Talker {
    @Override
    public String toString() {
        return String.format(
                "The %s (implemented by: %s) says \"%s\" Description: %s",
                this.getAnimalName(),
                this.getAuthor(),
                this.getSound(),
                this.getDescription()
        );

    }

    public String getDescription() {
        return "Override this method in your own class.";
    }

    public abstract String getAuthor();

    public abstract String getAnimalName();
}