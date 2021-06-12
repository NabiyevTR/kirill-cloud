package animals;

public class Animal {

    private String name;
    private int maxSwim = 10;
    private int maxRun = 10;

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public String getName() {
        return name;
    }



    public void run(int length) {
        if (length <= maxRun) {
            System.out.println(name + " has run " + length + "m.");
        } else  {
            System.out.println(name + " cannot run " + length + "m.");
        }

    }

    public void swim(int length) {
        if (length <= maxSwim) {
            System.out.println(name + " has swam " + length + "m.");
        } else  {
            System.out.println(name + " cannot swim " + length + "m.");
        }
    }


}
