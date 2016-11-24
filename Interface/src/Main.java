import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Violin's name and cost");
        Violin violin = new Violin(sc.nextLine(), sc.nextInt());

        System.out.println();

        System.out.println("Guitar's name and cost");
        Guitar guitar = new Guitar(sc.nextLine(),sc.nextInt());

        System.out.println();

        System.out.println("Balalaika's name and cost");
        Balalaika balalaika = new Balalaika(sc.nextLine(),sc.nextInt());

        System.out.println();

        violin.name();
        violin.cost();
        violin.play();
        System.out.println();

        guitar.name();
        guitar.cost();
        guitar.play();
        System.out.println();

        balalaika.name();
        balalaika.cost();
        balalaika.play();
        System.out.println();
    }
}
