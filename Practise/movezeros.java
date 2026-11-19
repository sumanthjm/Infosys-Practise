import java.util.Scanner;
import java.util.TreeSet;

public class movezeros {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            if (arr1[i]!=0) {
                System.out.print(arr1[i]+" ");
            }else{
                count++;
            }
            if (i==n-1) {
                while (count>0) {
                    System.out.print(0+" ");
                    count--;
                }
            }
            
        }
        
    }
}
