import java.util.Random;

class Transposing  {
  public static void main(String[] args){
    int[][] a = new int[4][3];
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
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a.length; j++) {
        System.out.print(a[j][i] + " ");
        }
      System.out.println(" ");
      }
    }
  }
