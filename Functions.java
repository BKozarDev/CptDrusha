import java.util.Scanner;

class Functions {
  public static int Max(int z[], int p) {
    int max = z[0];
    for (int i = 0; i < p; i++) {
      if (z[i] > max) {
        max = z[i];
        }
      }
    return max;
    }
    public static int Min(int b[], int p) {
      int min = b[0];
      for (int i = 0; i < p; i++) {
        if (b[i] < min) {
          min = b[i];
          }
        }
      return min;
      }
      public static int Sum(int c[], int p) {
        int s = 0;
        for (int i = 0; i < p; i++) {
          s += c[i];
          }
        return s;
        }
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = scan.nextInt();
        }
        int resultMax = Max(a, n);
        int resultMin = Min(a, n);
        int resultSum = Sum(a, n);
      System.out.println(" Max = " + resultMax + " | Min = " + resultMin + " | Sum = " + resultSum);
      }
  }
