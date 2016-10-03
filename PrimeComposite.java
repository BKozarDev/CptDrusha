class PrimeComposite {
    public static void main(String[] args) {
        boolean b = true;
        int a[] = {1, 2, 7, 169, 13, 10};
        for (int i=0; i < a.length - 1; i++) {
          int z = 0;
            if (a[i] == 2 || a[i] == 3 || a[i] == 5 || a[i] == 7) {
               System.out.println(i);
                }
            else {
               for (int j=2; j*j <= a[i]; j++)
               {
                  if (a[i]%j != 0 & a[i]%(j*j) != 0) {
                    b = false;
               }
               else {
                 b = true;
               }
             }
               if (b == false) {
                   for (int k = 2; k <= a[i+1]; k++) {
                     if (a[i+1]%k == 0 & b == false) {
                       System.out.println(i);
                       b = true;
                     }
                   }
            }
        }
     }
 }
}
