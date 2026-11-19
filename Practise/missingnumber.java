import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * missingnumber
 */
public class missingnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int large = 0;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            large = Math.max(large, arr1[i]);
        }
        int arr2[] = new int[large+1];
        for (int i = 0; i < n; i++) {
            arr2[arr1[i]]++;
            // if (arr2[arr1[i]]==0) {
            // System.out.print(arr1[i]+" ");
            // }
        }
        for (int i = 0; i < n; i++) {
            if (arr2[arr1[i]]>=2) {
                set.add(arr1[i]);
                // System.out.print(arr1[i] + " ");
            }
        }
        for (Integer i : set) {
            System.out.print(i+" ");
        }
    }
}