package programme20_poolarea;

public class Cuboid extends Rectangle { //Cuboid class extending Rectangle class
    private double height; //Integer declaration

    public Cuboid(double width, double length, double height) {
        super(width, length); // calling constructor from parent class
        this.height = height < 0 ? 0 : height; // setting height value using ternary operator
    }

    public double getHeight() { //method returning height value
        return height;
    }

    public double getVolume() { //method returning volume value
        return getArea() * this.height;
    }

}
