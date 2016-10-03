class Crossing {
  public static void main(String[] args) {
    int a[] = {2, 1, 2, -10, 5, 3, 4};
    int b[] = {6, 7, -14, 2, 100, 4};
    int i,j,l;
    int n;
    if (a.length < b.length) {
      n = a.length;
      }
    else {
      n = b.length;
      }
    int c[] = new int[n];
    l = 0;
    for (i = a.length-1; i > -1; i--) {
      for (j = b.length-1; j > -1; j--) {
        if (a[i] == b[j]) {
          c[l] = a[i];
          l++;
          }
        }
      }
    int k;
    for (i = 0; i < l; i++) {
      for (j = 0; j < l; j++) {
        if (i != j & c[i] == c[j]) {
            l--;
            for (k = j; k < l-1; k++) {
              c[k] = c[k+1];
              }
            }
        }
      }
      for (i = 0; i < l; i++) {
      System.out.print(c[i] + " ");
      }
  }
}
