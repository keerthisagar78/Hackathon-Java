import java.util.Scanner;

public class HouseholdWaterManagement {

    // Method to calculate total water consumption
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1a) Data Types
        int familyMembers = 4;
        double waterConsumed = 750.5;
        int houseNumber = 25;
        char waterUsageStatus = 'H';

        System.out.println("----- Household Details -----");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterUsageStatus);

        // 1b) If-Else Condition
        System.out.println("\n----- Water Bill -----");
        System.out.print("Enter water consumption in litres: ");
        double consumption = sc.nextDouble();

        int bill;

        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill: Rs." + bill);

        // 1c) Method
        System.out.println("\n----- Total Water Consumption -----");

        System.out.print("Enter morning water usage: ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total water consumption: " + total + " litres");

        sc.close();
    }
}