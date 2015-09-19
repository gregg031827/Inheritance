/**
 * Created by Gregg on 19/09/2015.
 */
public class MainClass {
    public static void main(String[] args) {
        Insect insect = new Insect();
        Butterfly butterfly = new Butterfly();
        Cockroach cockroach = new Cockroach();
        Ant ant = new Ant();

        System.out.println();

        insect.eat();
        insect.rest();

        butterfly.eat();
        butterfly.rest();

        cockroach.eat();
        cockroach.rest();

        ant.eat();
        ant.rest();
    }


}
