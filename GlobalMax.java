import java.util.Scanner;

class GlobalMax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5]; //Массив
    long mmax; //Глобальный максимум
    mmax = -999999;
    for(int i=a.length-1;i>-1;i--) { //Начало проверки
      a[i] = sc.nextInt();
      if (a[i]>mmax) {
        mmax=a[i];
        }
      } //Конец
    System.out.println("Global maxsimum - " + mmax); //Вывод
    }
}
