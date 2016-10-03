import java.util.Scanner;

class GlobalMin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5]; //Массив
    long mmin; //Глобальный минимум
    mmin = 999999;
    for(int i=a.length-1;i>-1;i--) { //Начало проверки
      a[i] = sc.nextInt();
      if (a[i]<mmin) {
        mmin=a[i];
        }
      } //Конец
    System.out.println("Global minimum - " + mmin); //Вывод
    }
}
