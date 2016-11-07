import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] a = new int[10];
        for(int i=0; i <a.length;i++) {
            a[i] = rd.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int x = sc.nextInt();
        int s = 0;
        for(int i =0;i<a.length;i++) {
            if(x != a[i]) {
                s++;
            }
        }
        System.out.println("a) " + s);
    }
}
