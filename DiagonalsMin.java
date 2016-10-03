class DiagonalsMin {
  public static void main(String[] args) {
    int[][] a = new int[5][5];
    int i, j;
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        a[i][j] = 5;  //Ввод массива
        }
        System.out.println();
      }
      a[0][1] = 1;
      a[0][2] = 2;
      a[0][3] = 3;           //Проверка
      a[0][4] = 4;
      a[1][2] = 5;
      a[1][3] = 6;
      a[1][4] = 7;
      a[2][3] = 8;
      a[2][4] = 9;
      a[3][4] = 9;
    int l;
    int min = a[0][1];
    for ( i = 0; i < 3; i++){    //поиск минимального
      for ( j = 0; j < 3; j++){
        if (j > i & a[i][j] < min) {
          min = a[i][j];
        }
  }
}
    System.out.print("minimum = " + min); //Вывод
    }
  }
