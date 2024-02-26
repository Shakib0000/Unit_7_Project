public class PostageCalculator {
    public static double calculatePostage(String zipCode1, String zipCode2, double weight, double height, double length, double width) {
        double cost = 3.75;
        int countyCode1 = Integer.parseInt(zipCode1.substring(0,3));
        int countyCode2 = Integer.parseInt(zipCode2.substring(0,3));
        cost += (weight / 0.10) * 0.05;
        cost += (double) (Math.abs(countyCode1 - countyCode2)) / 100;
        if (length*width*height > 36) {
            cost += ((length*width*height) - 36) * 0.10;
        }
        if (weight > 40) {
            cost += ((weight - 40) / 0.10) * 0.10;
        }
        return cost;
    }

    public static double calculatePostage(Address address1, Address address2, double weight, double height, double length, double width) {
        double cost = 3.75;
        int countyCode1 = Integer.parseInt(address1.getZipCode().substring(0,3));
        int countyCode2 = Integer.parseInt(address2.getZipCode().substring(0,3));
        cost += (weight / 0.10) * 0.05;
        cost += (double) (Math.abs(countyCode1 - countyCode2)) / 100;
        if (length*width*height > 36) {
            cost += ((length*width*height) - 36) * 0.10;
        }
        if (weight > 40) {
            cost += ((weight - 40) / 0.10) * 0.10;
        }
        return cost;
    }

    public static double calculatePostage(Package packageObject) {
        Address address1 = packageObject.getOrigin();
        Address address2 = packageObject.getDestination();
        double weight = packageObject.getWeightInPounds();
        double length = packageObject.getLengthInInches();
        double width = packageObject.getWidthInInches();
        double height = packageObject.getHeightInInches();
        double cost = 3.75;
        int countyCode1 = Integer.parseInt(address1.getZipCode().substring(0,3));
        int countyCode2 = Integer.parseInt(address2.getZipCode().substring(0,3));
        cost += (weight / 0.10) * 0.05;
        cost += (double) (Math.abs(countyCode1 - countyCode2)) / 100;
        if (length*width*height > 36) {
            cost += ((length*width*height) - 36) * 0.10;
        }
        if (weight > 40) {
            cost += ((weight - 40) / 0.10) * 0.10;
        }
        return cost;
    }
}
