import java.util.ArrayList;
import java.util.Scanner;

/**
 * wightandcategor
 */
public class wightandcategor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int N = sc.nextInt();
        int arr1[] = new int[N];
        int arrCat[] = new int[N];
        Boolean unqualityCheck = false;
        int one = 0;
        int zero = 0;
        System.out.println("Enter Array Elements");
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Catagory Elements");
        for (int i = 0; i < N; i++) {
            arrCat[i] = sc.nextInt();
            if (arrCat[i] == 1) {
                one++;
            } else {
                zero++;
            }
        }
        if (one != zero) {
            unqualityCheck = true;
        }
        if (unqualityCheck) {
            System.out.println(-1);
            return;
        } else {
            System.out.println("Enter 0 & 1 Elements");
            int arrOne[] = new int[N / 2];
            int arrZero[] = new int[N / 2];
            int oneCount = 0;
            int zeroCount = 0;
            for (int i = 0; i < N; i++) {
                if (arrCat[i] == 0) {
                    arrZero[zeroCount] = arr1[i];
                    zeroCount++;
                } else {
                    arrOne[oneCount] = arr1[i];
                    oneCount++;
                }
            }
            int StroreArray[]=new int[N/2];
            int matrix[][]=new int[N/2][N/2];
            for (int i = 0; i < arrOne.length; i++) {
                for (int j = 0; j < arrOne.length; j++) {
                    matrix[i][j]= Math.max(arrZero[i], arrOne[j]);
                    
                }
            }
            int lastSum=0;
            int hightest=0;
            for(int j=0;j<N/2;j++){
                lastSum=0;
                for(int i=0;i<N/2;i++){
                    lastSum=lastSum+matrix[j][i];
                    hightest=Math.max(lastSum, hightest);
                }
            }
            System.out.println(hightest);
            // for(int j=0;j<N/2;j++){
                
            //     for(int i=0;i<N/2;i++){
            //        System.out.print(matrix[j][i]+" ");
            //     }
            //     System.out.println();
            // }
        }
    }
}