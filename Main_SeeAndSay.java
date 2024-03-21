package SeeAndSay;

/**
 * @author David A. Katz <dkatz3@ccbcmd.edu>
 */
public class Main_SeeAndSay {

    public static void main(String[] args) {

        AnimalListMaker alm = new AnimalListMaker();

        for (Talker talker : alm.getAnimalList()) {
            try {
                System.out.println(talker);
            } catch (Exception e) {
                System.out.printf("Oops! Someone's code is broken in class: '%s' with message: '%s'",
                        talker.getClass().getSimpleName(),
                        e.getCause());
            }
        }
    }
}