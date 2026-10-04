import java.util.Scanner;
public class TotalEnergyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter morning energy generated (kWh): ");
        double morning = sc.nextDouble();
        System.out.print("Enter evening energy generated (kWh): ");
        double evening = sc.nextDouble();
        double totalEnergy = morning + evening;
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");
        sc.close();
    }
}
