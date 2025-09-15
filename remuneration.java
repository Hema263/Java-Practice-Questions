import java.util.Scanner;
public class remuneration {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Beggining of odometer:");
        float beggining= scan.nextFloat();
        System.out.println("Ending of odometer:");
        float ending=scan.nextFloat();
        float distance=ending-beggining;
        float remuneration=distance*25;
        System.out.printf("%.2f",remuneration);

    }
}
