import java.util.Random;

class Turn {
  public static void main(String[] args){
    int[][] a = new int[5][5];
    int i, j;
    Random random =
              new Random();
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a.length; j++) {
        a[i][j] = random.nextInt(10);
        }
      }
      for (j = 0; j < a.length; j++) {
        for (i = 0; i < a.length; i++) {
          System.out.print(a[j][i] + " ");
          }
        System.out.println(" ");
        }
    System.out.println();
    int n = a.length;
    int b;
//----------------------------------------------------------
    for (i = 0; i < a.length - 1; i++) {
      for (j = 0; j < a.length - i - 1; j++) {
        int h = a[i][j];
        a[i][j] = a[a.length - 1 - j][a.length - 1 - i];
        a[a.length - 1 - j][a.length - 1 - i] = h;
        }
      }
//----------------------------------------------------------
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a.length; j++) {
        System.out.print(a[i][j] + " ");
        }
      System.out.println(" ");
      }
    }
  }
