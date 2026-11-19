import java.util.Scanner;

public class maxcontisubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur array");
        String a = sc.nextLine();
        String a2[] = a.split(" ");
        int a3[] = new int[a2.length];
        for (int i = 0; i < a2.length; i++) {
            a3[i] = Integer.parseInt(a2[i]);
        }
        int start=0,end=0;
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < a3.length; i++) {
            int sum = 0;
            for (int j = i; j < a3.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + a3[k];
                }
                if (sum > maxvalue) {
                    start=i;
                    end=j;
                    maxvalue = Math.max(maxvalue, sum);
                }
                sum=0;
            }
        }
        System.out.println(start+" to "+end+"="+maxvalue);
    }
}
