public class picalc {
  public static double pi() {
    double e = 0.0001;
    int k = 1;
    double piresult = 2;
    while (Math.abs(piresult - Math.PI) >= e){
      piresult = piresult * 4*k*k/(4*k*k - 1);
      k++;
        }
    return piresult;
  }
  public static void main(String[] args) {
  double piresult = pi();
    System.out.println(piresult + " ~ " + Math.PI);
  }
}
