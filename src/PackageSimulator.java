import java.util.ArrayList;

public class PackageSimulator {
    private static ArrayList<Package> packages = new ArrayList<Package>();

    public static void generatePackages(int number) {
        for (int i = 0; i < number; i++) {
            String randomZipCode1 = String.valueOf((int) (Math.random() * 99500) + 501);
            if (randomZipCode1.length() == 3) {
                randomZipCode1 = "00" + randomZipCode1;
            }
            else if (randomZipCode1.length() == 4) {
                randomZipCode1 = "0" + randomZipCode1;
            }
            String randomZipCode2 = String.valueOf((int) (Math.random() * 99500) + 501);
            if (randomZipCode2.length() == 3) {
                randomZipCode2 = "00" + randomZipCode2;
            }
            else if (randomZipCode2.length() == 4) {
                randomZipCode2 = "0" + randomZipCode2;
            }
            double randomWeight = (int) (Math.random() * 150) + 1;
            double randomLength = (int) (Math.random() * 35) + 1;
            double randomWidth = (int) (Math.random() * 35) + 1;
            double randomHeight = (int) (Math.random() * 35) + 1;
            Address randomAddress1 = new Address("123", "Random Street", "3C", "City", "State", randomZipCode1);
            Address randomAddress2 = new Address("123", "Random Street", "3C", "City", "State", randomZipCode2);
            Package newPackage = new Package(randomAddress1, randomAddress2, randomWeight, randomLength, randomHeight, randomWidth);
            packages.add(newPackage);
        }
    }

    public static double generateTotalCost() {
        double cost = 0;
        for (Package aPackage : packages) {
            cost += PostageCalculator.calculatePostage(aPackage);
        }
        return cost;
    }

    public static String getSimulationInfo() {
        String str = "Randomly generated packages info:";
        int counter = 1;
        for (Package aPackage : packages) {
            str += "\nPackage " + counter + ": ___________________________________";
            str += "\nOrigin address: " + aPackage.getOrigin();
            str += "\nDestination address: " + aPackage.getDestination();
            str += "\nWeight: " + aPackage.getWeightInPounds() + " pounds";
            str += "\nHeight: " + aPackage.getHeightInInches() + " inches";
            str += "\nLength: " + aPackage.getLengthInInches() + " inches";
            str += "\nWidth: " + aPackage.getWidthInInches() + " inches";
            str += "\nCost: $" + String.format("%.2f", PostageCalculator.calculatePostage(aPackage));
            counter++;
        }
        str += "\n__________________________________";
        str += "\nTotal cost of all the packages: $" + String.format("%.2f", generateTotalCost());
        return str;
    }

    public static void resetSimulation() {
        packages = new ArrayList<Package>();
    }
}
