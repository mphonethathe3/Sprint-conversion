package com.mycompany.sprint;

  import java.util.Scanner;

public class Sprint {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("The unit you want to convert from : ");
            String fromUnit = scanner.nextLine();
            
            System.out.print("The unit you want to convert to : ");
            String toUnit = scanner.nextLine();
            
            System.out.print("The quantity to be converted: ");
            double quantity = scanner.nextDouble();
            
            double result = convert(fromUnit, toUnit, quantity);
            
            System.out.println(quantity + " " + fromUnit + " is equal to " + result + " " + toUnit);
        }
    }

    private static double convert(String fromUnit, String toUnit, double quantity) {
        
        double celsius = ((quantity - 32) / 1.8);
        double kgs = quantity * 0.454;
        double meters = quantity / 3.28;

        if (fromUnit.equalsIgnoreCase("feet") && toUnit.equalsIgnoreCase("meters")) {
            return meters;
        } else if (fromUnit.equalsIgnoreCase("pounds") && toUnit.equalsIgnoreCase("kgs")) {
            return kgs;
        } else if (fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("celsius")) {
            return celsius;
        }
        
        // If units are not supported, return 0
        return 0;
    }
}
