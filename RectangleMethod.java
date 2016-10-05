import java.util.Scanner;

 class RectangleMethod {

   public static double[] generateX(double a, double b, int n) {
     double c[] = new double[n];
     double d = (b - a) / (n-1);
     c[0] = a;
     for (int i = 1; i < n; i++){
       c[i] = c[i-1] + d;
       }
     return c;
     }

   public static double func(double x) {
     return Math.sin(x);
     }

   public static double calc(double x[], int n) {
     double mainresult = 0;
     for (int i = 0; i < n-1; i++){
       mainresult += func(x[i]) * (x[i + 1] - x[i]);
     }
     return mainresult;
   }

   public static void main(String[] args){
     Scanner sc = new
                      Scanner(System.in);
            System.out.println("Enter A: ");
     double a = sc.nextDouble();
            System.out.println("Enter B: ");
     double b = sc.nextDouble();
            System.out.println("Enter N: ");
     int n = sc.nextInt();
      double[] arr = new double[n];
     arr = generateX(a,b,n);
     double mainresult = calc(arr, n);
     System.out.println(mainresult);
   }
 }
