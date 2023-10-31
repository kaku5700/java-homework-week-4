package programme24_methodoverriding;

class SBI extends Bank { // SBI class extending bank class
    public int getRateOfInterest() { // overriding method of parent class to return different value
        return 8;
    }
}
