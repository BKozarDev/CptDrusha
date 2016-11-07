import java.util.Scanner;
public class ETask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[11];
        for(int i = 0;i<x.length;i++) {
            x[i] = sc.nextInt();
        }
        int j = 0;
        int size = 1;
        boolean z = true;
        int[] b = new int[x.length];
        int[] a = new int[x.length];
        for(int i = 0; i<x.length-1;i++) {
            if(z) {
                a[j] = i;
                z = false;
            }
            if(x[i]!=x[i+1]) {
                b[j] = i;
                j++;
            }
            z =true;
        }
        System.out.println();
        for(int i = 0;i<x.length;i++) {
            System.out.print(a[i] + " ");
        }
        for(int i = 0;i<x.length;i++) {
            System.out.print(b[i] + " ");
        }
    }
}
