public class Package {
    private Address origin;
    private Address destination;
    private double weightInPounds;
    private double lengthInInches;
    private double heightInInches;
    private double widthInInches;

    public Package(Address origin, Address destination, double weightInPounds, double lengthInInches, double heightInInches, double widthInInches) {
        this.origin = origin;
        this.destination = destination;
        this.weightInPounds = weightInPounds;
        this.lengthInInches = lengthInInches;
        this.heightInInches = heightInInches;
        this.widthInInches = widthInInches;
    }

    public Address getOrigin() {
        return origin;
    }

    public Address getDestination() {
        return destination;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public double getLengthInInches() {
        return lengthInInches;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public double getWidthInInches() {
        return widthInInches;
    }
}
