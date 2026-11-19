// import java.sql.Array;
// import java.util.Arrays;
// import java.util.Scanner;

// public class nthlargest {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr1[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr1[i]=sc.nextInt();
//         }
//         Arrays.sort(arr1);
//         int largeArrayElement=arr1[arr1.length-1];
//         if (arr1[arr1.length-1]==0) {
//             System.out.println(0);
//             return;
//         }
//         int arr2[]=new int[largeArrayElement+2];
//         for(int i=0;i<n;i++){
//            arr2[arr1[i]]++;
//         }
//         int count=0;
    
//         for(int i=arr2.length-1;i>=0;i--){
//            if(arr2[i]>=1){
//             count++;
//            }
//            if (count==2) {
//             System.out.println("2th Largest number is "+":"+ i);
//             return ;
//            }
//         }
//     }
// }

import java.util.Scanner;
import java.util.TreeSet;

/**
 * nthlargest
 */
public class nthlargest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        TreeSet<Integer> tree1=new TreeSet<>();
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            tree1.add(arr1[i]);
        }
        int pos=tree1.size()-3+1;
        int count=0;
        for (Integer t : tree1) {
            count++;

            if (count==pos) {
                System.out.println(t);
            }
        }
    }
}