import java.util.*;

public class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int max=0;
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            if (arr1[i]>max) {
                max=arr1[i];
            }
        }
        int arr2[] = new int[max + 2];
        for (int i = 0; i < n; i++) {
            arr2[arr1[i]]++;
            if (arr2[arr1[i]]==2) {
                System.out.println(arr1[i]);
            }
        }
        
    }
}
