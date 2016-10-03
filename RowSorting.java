import java.util.Random;

class RowSorting {
    public static void main(String[] args){
      int[][] a = new int[5][5];
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
      int p;
      for (p = 0; p < a.length; p++) {
        for (i = a[p].length - 1; i > -1; i--) {
          for (j = 0; j < i; j++) {
            if (a[p][j] > a[p][j+1]) {
              int l = a[p][j];
              a[p][j] = a[p][j+1];
              a[p][j+1] = l;
              }
            }
          }
        }
        i = 0;
        j = 0;
        int n = a.length;
        int m = a[i].length;
        for (i = 0; i < n; i++) {
          for (j = 0; j < m; j++) {
            System.out.print(a[i][j] + " ");
            }
          System.out.println(" ");
        }
      }
    }
