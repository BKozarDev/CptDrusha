import java.util.Scanner;

public class BTask {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0; i <a.length;i++) {
            a[i] = sc.nextInt(10);
        }
        System.out.println();
        int[] y = new int[a.length];
        int j = 0;
        y[0] = a[0];
        while(j<a.length-1) {
            j++;
            y[j] = 0;
            if(a[j-1]!=a[j]) {
                y[j] = a[j];
            }
        }
        System.out.println();
        System.out.print("b) ");
        for(int i = 0;i<a.length;i++){
            System.out.print(y[i] + " ");
        }
    }
}
