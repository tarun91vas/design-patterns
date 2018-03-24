package decorator;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 20;
    }

    public  static void main (String[] args) {
        Espresso espresso = new Espresso();

        Mocha singleMocha = new Mocha(espresso);
        Mocha doubleMocha = new Mocha(singleMocha);

        Whip whip = new Whip(doubleMocha);

        System.out.println(whip.getDescription());
        System.out.println(whip.cost());
    }
}
