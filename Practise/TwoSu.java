// import java.util.HashSet;
// import java.util.Scanner;

// public class twoSum {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr1[] = new int[n];
//         for (int i=0;i<n;i++) {
//             arr1[i]=sc.nextInt();
//         }
//         int k = sc.nextInt();  
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if ((arr1[i]+arr1[j])==k) {
//                     System.out.println(i+","+j);
//                 }
//                 if (arr1[i]==k) {
//                     System.out.println(i);
//                 }
//             }
//         }
//     }
// }

import java.util.*;

public class TwoSu {
    public static void main(String[] args) {

        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            int complement = target - num;

            if (map.containsKey(complement)) {
                System.out.println(complement + "+" + num + "==" + target);
                
            }

            map.put(num, 1);
        }
        System.out.println(map);
    }
}
