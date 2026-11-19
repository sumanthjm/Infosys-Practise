import java.util.*;

public class reverse {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer arr1[]=new Integer[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        Collections.reverse(Arrays.asList(arr1));
        System.out.println(Arrays.toString(arr1));
    }
}
