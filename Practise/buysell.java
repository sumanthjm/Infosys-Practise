import java.util.Scanner;

public class buysell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur array");
        String a = sc.nextLine();
        String a2[] = a.split(" ");
        int a3[] = new int[a2.length];
        for (int i = 0; i < a2.length; i++) {
            a3[i] = Integer.parseInt(a2[i]);
        }
        int buy=0;
        int sell=0;
        int maxprofit=Integer.MIN_VALUE;
        for(int i=0;i<a3.length;i++){
            for(int j=i+1;j<a3.length;j++){
                if (a3[j]-a3[i]>maxprofit) {
                    maxprofit=a3[j]-a3[i];
                    buy=a3[i];
                    sell=a3[j];
                }
            }
        }
        System.out.println("buyed at:"+buy+"  ,sold at: "+sell+"   ,profit:"+maxprofit);
    }
}
