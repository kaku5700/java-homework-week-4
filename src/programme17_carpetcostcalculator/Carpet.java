package programme17_carpetcostcalculator;

public class Carpet {
    private double cost; // variable declaration

    public Carpet(double cost) { //Parameterized constructor initializing cost
        if (cost < 0) {
            this.cost = 0.0;
        } else {
            this.cost = cost;
        }
    }
    public double getCost() {
        return this.cost;
    }
}
