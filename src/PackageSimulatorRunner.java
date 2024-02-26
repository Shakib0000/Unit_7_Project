import java.util.Scanner;

public class PackageSimulatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("__________________________\nWhat would you like to do?\n1. Calculate the cost of one package\n2. Simulate packages\n3. How package costs are calculated\n4. Exit");
        System.out.print("Input: ");
        String input = s.nextLine();
        System.out.println("__________________________");
        if (input.equals("1")) {
            System.out.print("Enter the zip code of the origin package: ");
            input = s.nextLine();
            String originZipCode = input;
            System.out.print("Enter the zip code of the destination package: ");
            input = s.nextLine();
            String destinationZipCode = input;
            System.out.print("Enter the weight of the package: ");
            input = s.nextLine();
            String weight = input;
            System.out.print("Enter the height of the package: ");
            input = s.nextLine();
            String height = input;
            System.out.print("Enter the length of the package: ");
            input = s.nextLine();
            String length = input;
            System.out.print("Enter the width of the package: ");
            input = s.nextLine();
            String width = input;
            System.out.println("Cost: $" +  String.format("%.2f", PostageCalculator.calculatePostage(originZipCode, destinationZipCode, Double.parseDouble(weight), Double.parseDouble(height), Double.parseDouble(length), Double.parseDouble(width))));
        }
        else if (input.equals("2")) {
            System.out.print("How many packages would you like to simulate: ");
            input = s.nextLine();
            PackageSimulator.generatePackages(Integer.parseInt(input));
            System.out.println(PackageSimulator.getSimulationInfo());
        }
        else if (input.equals("3")) {
            System.out.println("The formula to determine the cost of shipping is:\n-The base cost is $3.75\n-Add 5 cents for each tenth of a pound\n-Divide the difference in county codes by 100 and add that to calculate the final total\n-The county code is the first 3 digits of the zip code\n\nAccounting for oversize packages:\n-Any package that exceeds a combined 36 inches will cost an additional 10 cents per inch.\n-Additionally, packages that are more than 40 pounds will be charged 10 cents per tenth of a pound over the 40 pound limit.");
        }
        else if (input.equals("4")) {
            System.out.println("Womp womp, it seems you have no use for the Package Shipping Simulator. Goodbye!");
        }
        else {
            System.out.println("Invalid input.");
        }
    }
}
