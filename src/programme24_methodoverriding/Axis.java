package programme24_methodoverriding;

class Axis extends Bank {
    public int getRateOfInterest() { // overriding method of parent class to return different value
        return 9;
    }
}
