package programme22_multilevelinheritance;

/**
 * Multilevel Inheritance Example(Create package name ‘multilevelinheritance22’ and
 * create all below classes in this package)
 */
class TestInheritance2 {
    public static void main(String[] args) {
        BabyDog d = new BabyDog(); // Object creation by BabyDog class which can access all methodsfrom other classes
        d.weep();
        d.bark();
        d.eat();
    }
}
