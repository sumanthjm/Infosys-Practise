import java.util.HashSet;
import java.util.Scanner;

public class threesum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i=0;i<n;i++) {
            arr1[i]=sc.nextInt();
        }
        int f = sc.nextInt();  
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if ((arr1[i]+arr1[j]+arr1[k])==f) {
                        System.out.println(i+","+j+","+k);
                    }
                }
            }
        }
    }
}
