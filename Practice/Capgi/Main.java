package Capgi;
import javax.annotation.processing.SupportedOptions;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.calculateElectricityBill(150));
        System.out.println(Main.calculateElectricityBill(0));
        System.out.println(Main.calculateElectricityBill(-10));
    }

    static double calculateElectricityBill(int units) {
        double amt =  0.0;
        if(units < 0)
        {
            System.out.println("INVALID INPUT");
            // System.exit(0);
            return -1;
        }
        if (units > 70 ) {
            amt += 30 * 3.5;
            units -= 30;
            amt += 70 * 4;
            units -= 70;
            amt += units * 5;
        } else if (units >30 &&units <= 70) {
            amt += 30 * 3.5;
            units -= 30;
            amt += units * 4;

        } else if (units > 1 && units <= 30) {
            amt += units * 3.5;
        }
        return amt;
    }
}
