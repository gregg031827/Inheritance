/**
 * Created by Gregg on 19/09/2015.
 */
public class Ant extends Insect {
    public Ant(){
        super();
        System.out.println("A new ant has been created!");
    }

    @Override
    public void eat() {
        System.out.println("An ant eats...");
    }

    @Override
    public void rest() {
        System.out.println("An ant rests...");
    }
}
