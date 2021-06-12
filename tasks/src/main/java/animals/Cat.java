package animals;

public class Cat extends Animal{

    public static int counter = 0;

    public static void printAmount () {
        System.out.println(counter);
    }

    public Cat(String name) {
        super(name, 200, 0);
        counter ++;
    }

    public void saymay() {
        System.out.println("Myay");
    }

}
