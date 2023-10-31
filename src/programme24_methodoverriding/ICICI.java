package programme24_methodoverriding;

class ICICI extends Bank { //ICICI class extending bank class
    public int getRateOfInterest() { // overriding method of parent class to return different value
        return 7;
    }
}
