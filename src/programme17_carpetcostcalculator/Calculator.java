package programme17_carpetcostcalculator;

public class Calculator {
    private Floor floor;//variable declaration
    private Carpet carpet; // variable declaration

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() { //Return type method to return total cost by multiplying floor area and carpet cost.
        return floor.getArea() * carpet.getCost();
    }
}
