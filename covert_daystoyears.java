import java.util.Scanner;

public class covert_daystoyears {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of days");
        int number_of_days=scan.nextInt();
        int years=number_of_days/365;
        System.out.println("years:" + years);
        int remaining_days=number_of_days%365;
        int months=remaining_days/30;
        System.out.println("months:" + months);
        int days=remaining_days%30;
        System.out.println("days:" + days);
    }
}
