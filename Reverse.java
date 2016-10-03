class Reverse {
  public static void main(String[] args){
    int a[] = {1,-5,4,6,7,-10};
    int b[]= new int[a.length];
    int c=0;
    int i;
    for (i = a.length-1; i > -1; i--){
      b[c] = a[i];
      c++;
      }
    for (i = 0; i < a.length; i++){
      System.out.println(b[i]);
      }
    }
}
