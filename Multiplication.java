import java.util.Random;

class Multiplication {
    public static void main(String[] args){
      int[][] a = new int[2][3];
      int i, j;
      Random random =
                new Random();
      for (i = 0; i < a.length; i++) {
        for (j = 0; j < a[i].length; j++) {
          a[i][j] = random.nextInt(10);
          }
        }
        for (j = 0; j < a.length; j++) {
          for (i = 0; i < a[j].length; i++) {
            System.out.print(a[j][i] + " ");
            }
          System.out.println(" ");
          }
      System.out.println();
// =============================================================================
      int[][] b = new int [3][4];
      for (i = 0; i < b.length; i++) {
        for (j = 0; j < b[i].length; j++) {
          b[i][j] = random.nextInt(10);
          }
        }
      for (j = 0; j < b.length; j++) {
        for (i = 0; i < b[j].length; i++) {
          System.out.print(b[j][i] + " ");
          }
        System.out.println(" ");
        }
      System.out.println();
//==============================================================================
      i = 0;
      int s, p, v, n, m;
      if (a.length < b.length)
        {n = a.length;} else {n = b.length;}
      if (a[i].length < b[i].length)
        {m = b[i].length;} else {m = a[i].length;}
      int[][] c = new int[m][n];
      s = 0;
      System.out.println(n + " " + m + " " + b.length);
      for (i = 0; i < n; i++) {
        for (j = 0; j < m; j++) {
          for (p = 0; p < b.length; p++) {
            c[j][i] += a[i][p]*b[p][j];
            }
            System.out.println();
          }
        }
//==============================================================================
    for (i = 0; i < n; i++) {
      for (j = 0; j < m; j++) {
        System.out.print(c[j][i] + " ");
        }
        System.out.println();
        }
      }
    }
