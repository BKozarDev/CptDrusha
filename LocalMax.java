import java.util.Scanner;

class LocalMax { //Hw = Homework
    public static void main(String[] args) {
        Scanner scanner =
          new Scanner(System.in);
        int a[] = new int[6]; //Массив
        long max = -999999; //Локальный максимум
        for (int i = a.length-1; i>-1; i--) { //Вводим массив
            a[i] = scanner.nextInt();
        } //Конец ввода
        for (int i = a.length - 2; i > 0; i--) { //Начало проверки
          if (a[i]>a[i+1]) {
            if(a[i]>a[i-1]) {
              max=a[i];
            }
          }
        } //Конец проверки
        System.out.println("maximum - " + max);
        }
    }
