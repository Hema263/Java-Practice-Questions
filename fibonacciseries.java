import java.util.*;
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        for(int i=2;i<n;i++){
        int next=first+second;
        System.out.print(next+" ");
        first=second;
        second=next;
        }
    }
}
