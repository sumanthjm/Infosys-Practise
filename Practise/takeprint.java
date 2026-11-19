import java.util.Arrays;
import java.util.Scanner;

public class takeprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur array");
        String a=sc.nextLine();
        String  a2[]=a.split(" ");
        int a3[]=new int[a2.length];
        for(int i=0;i<a2.length;i++){
            a3[i]=Integer.parseInt(a2[i]);
        }
        System.out.println(Arrays.toString(a3));
    }
}
