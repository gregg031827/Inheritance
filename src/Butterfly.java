/**
 * Created by Gregg on 19/09/2015.
 */
public class Butterfly extends Insect{
    public Butterfly(){
        super();
        System.out.println("A new butterfly has been created!");
    }

    @Override
    public void eat() {
        System.out.println("A butterfly eats...");
    }

    @Override
    public void rest() {
        System.out.println("A butterfly rests...");
    }
}
