package programme23_methodoverriding;

class Bike2 extends Vehicle { //Bike2 class extending Vehicle class
    public void run() {
        System.out.println("Vehicle is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2(); // object creation of Bike2 class
        obj.run(); // will run method using logic provided in Bike2 class
    }
}
