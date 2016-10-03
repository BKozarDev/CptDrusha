import java.util.Scanner;

class LocalMin { //Hw = Homework
    public static void main(String[] args) {
        Scanner scanner =
          new Scanner(System.in);
        int a[] = new int[6]; //Массив
        long min = 999999; //Локальный минимум
        for (int i = a.length-1; i>-1; i--) { //Вводим массив
            a[i] = scanner.nextInt();
        } //Конец ввода
        for (int i = a.length - 2; i > -1; i--) { //Начало проверки
          if (a[i]<a[i+1]) {
            if(a[i]<a[i-1]) {
              min=a[i];
            }
          }
        } //Конец проверки
        System.out.println("minimal - " + min);
        }
    }
