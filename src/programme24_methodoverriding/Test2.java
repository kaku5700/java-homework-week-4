package programme24_methodoverriding;

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI(); // object creation of SBI class
        ICICI i = new ICICI();// object creation of ICICI class
        Axis a = new Axis(); // object creation of AXIS class
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest()); //method of bank overriding by SBI class
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest()); //method of bank overriding by ICICI class
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest()); //method of bank overriding by AXIS class
    }
}
