import java.util.Scanner;

public class CTask {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0; i <a.length;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println();
        int size = 1;
        int[] v = new int[a.length];
        for(int i = 0;i<a.length-1;i++) {
            if(a[i]!=a[i+1]){
                v[size]++;
                size = 0;
            }
            size++;
            if(i == a.length - 2){
                v[size]++;
            }
        }
        System.out.println("c) ");
        for(int i = 0; i<v.length; i++) {
            System.out.print(i+") " + v[i] + "; ");
        }
    }
}