import java.util.Scanner;

public class picalcfunc {
  public static double pi(double e, int i) {
    double piresult = 2;
    double piq = 0;
    for (int z = 1; z <= i; z++) {
      piresult = piresult * 4*z*z/(4*z*z - 1);
      if (Math.abs(piresult - Math.PI) >= e) {
        piq = piresult;
      }
        }
    return piq;
  }
  public static void main(String[] args) {
    Scanner sc =
                new Scanner(System.in);
System.out.println("Enter E");
    double e = sc.nextDouble();
System.out.println("Enter Number");
    int i = sc.nextInt();
  double piresult = pi(e, i);
    if (piresult != 0) {
    System.out.println(piresult + " ~ " + Math.PI);
  }
  else {
    System.out.println("Error");
    }
  }
}
