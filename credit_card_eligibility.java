import java.util.Scanner;

public class credit_card_eligibility {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.print("Primary Applicant Age:");
       int P_age=scan.nextInt();
       System.out.print("Add-on card Applicant Age:");
       int A_age=scan.nextInt();
       int salaried=1;
       int self_employed=2;
       int student=3;
       int retired_pensioner=4;
       System.out.print("Employment Type:");
       int employment_type=scan.nextInt();
       System.out.print("Income:");
       int income=scan.nextInt();
       if(P_age>21 && P_age<60 && A_age>18 && income<=300000){
        System.out.println("Yes, You Are Eligible For SBI Credit Card");
       }
       else{
        System.out.println("No, You Are Not Eligible For SBI Credit Card");
       }
    }
    
}
