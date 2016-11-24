
public class Balalaika {
    private String name;
    private int cost;
    public void play() {
        System.out.println("Tryn' Tryn'");
    }
    public void name() {
        System.out.println(name);
    }
    public void cost() {
        System.out.println(cost + "$");
    }
    public Balalaika(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
