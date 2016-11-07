import java.util.Scanner;

public class DTask {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[11];
        for(int i=0; i <a.length;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println();
        int size = 1;
        int j = 1;
        int[] u = new int[a.length];
        for(int i = 0;i<a.length-1;i++) {
            if(a[i]!=a[i+1]){
                u[j]=size;
                size = 0;
                j++;
            }
            size++;
            if(i == a.length - 2){
                u[j]=size;
            }
        }
        System.out.println("c) ");
        for(int i = 1; i<u.length; i++) {
            System.out.print(i+") " + u[i] + "; ");
        }
    }
}