
public class Violin implements Instruments {
    private String name;
    private int cost;
    public void play(){
        System.out.println("John Cenaaaa!!!");
    }
    public void name(){
        System.out.println(name);
    }
    public void cost(){
        System.out.println(cost + "$");
    }
    public Violin(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
