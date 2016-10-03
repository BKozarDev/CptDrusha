import java.util.Scanner;

class Removing {
  public static void main(String[] args) {
    Scanner sc = new
            Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int i, j;
    for (i = 0; i <= n-1; i++) {  //заполнение массива
      a[i] = sc.nextInt();
      }
    int t, d = sc.nextInt();
    for (i = d; i < n-1; i++) {  //сдвиг числа в конец
        t = a[i];
        a[i] = a[i+1];
        a[i+1] = t;
        }
    System.out.println();
    for (i = 0; i <=n-2; i++) { //вывод без последнего элемента
      System.out.println(a[i]);
      }
  }
}
