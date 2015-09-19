/**
 * Created by Gregg on 19/09/2015.
 */
public class Cockroach extends Insect{
    public Cockroach(){
        super();
        System.out.println("A new cockroach has been created!");
    }

    @Override
    public void eat() {
        System.out.println("A cockroach eats...");
    }

    @Override
    public void rest() {
        System.out.println("A cockroach rests...");
    }
}
