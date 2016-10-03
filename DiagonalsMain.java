class SumMain {
  public static void main(String[] args) {
    int[][] a = new int[5][5];
    int i, j;
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        a[i][j] = 5;  //Ввод массива
        }
      }
    // a[0][0] = 1;
    // a[1][1] = 8;
    // a[2][2] = 10;           //Проверка
    // a[3][3] = 1;
    // a[4][4] = 11;
    int s = 0;
    int l = 0;
    for (i = 0; i < a.length; i++) {
      System.out.println(a[i][l]);
      s += a[i][l]; //Сумма (вычисление)
      l++; //Сдвиг на одну ячейку вправо
      }
    System.out.print("summa = " + s); //Вывод
    }
  }
