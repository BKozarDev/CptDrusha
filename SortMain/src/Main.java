import java.util.Random;

public class Main {
    public static int[] sort(int[] a){
        int l = a.length;
        if(l<2){return a;}
        int middle = a.length/2;
        int middle2 = a.length - middle;
        int[] a1 = new int[middle];
        int[] a2 = new int[middle2];
        for(int i=0;i<middle;i++){
            a1[i] = a[i];
        }
        int p=0;
        for(int i=middle2; i<a.length;i++){
            a2[p] = a[i];
            p++;
        }
        int[] left = sort(a1);
        int[] right = sort(a2);
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int j = 0, k = 0;
        for (int o = 0; o < result.length; o++) {
            if (j > left.length - 1) {
                int a = right[k];
                result[o] = a;
                k++;
            } else if (k > right.length - 1) {
                int a = left[j];
                result[o] = a;
                j++;
            } else if (left[j] <= right[k]) {
                int a = left[j];
                result[o] = a;
                j++;
            } else {
                int b = right[k];
                result[o] = b;
                k++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[10];
        for(int i=0; i< a.length; i++){
            a[i] = rd.nextInt(26);
        }
        int[] result;
        result = sort(a);
        for (int i = 0; i<a.length;i++) {
            System.out.print(result[i] + " ");
        }
    }
}

