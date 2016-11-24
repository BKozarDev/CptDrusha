
public class Guitar implements Instruments {
    private String name;
    private int cost;
    public void play() {
        System.out.println("trin' trin'");
    }
    public void name() {
        System.out.println(name);
    }
    public void cost() {
        System.out.println(cost + "$");
    }
    public Guitar(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
