import static java.lang.System.*;

public class Zombie implements Monster {
    private String name;
    private int size;

    public Zombie() {
        name = "Zomby";
        size = 8;
    }

    public Zombie(String n, int s) {
        name = n;
        size = s;
    }

    public int getHowBig() {
        return size;
    }

    public String getName() {
        return name;
    }

    public boolean isBigger(Monster other) {
        return (size > other.getHowBig());
    }

    public boolean isSmaller(Monster other) {
        return (size < other.getHowBig());
    }

    public boolean namesTheSame(Monster other) {
        return name.equals(other.getName());
    }

    public String toString() {
        return name + " " + size;
    }
}