public class Address {
    private String houseNumber;
    private String streetName;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zipCode;

    public Address(String houseNumber, String streetName, String apartmentNumber, String city, String state, String zipCode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(Address address) {
        this.houseNumber = address.getHouseNumber();
        this.streetName = address.getStreetName();
        this.apartmentNumber = address.getApartmentNumber();
        this.city = address.getCity();
        this.state = address.getState();
        this.zipCode = address.getZipCode();
    }

    public Address(String address) {
        String[] addressComponents = address.split(" ");
        this.houseNumber = addressComponents[0];
        this.streetName = addressComponents[1];
        this.apartmentNumber = addressComponents[2];
        this.city = addressComponents[3];
        this.state = addressComponents[4];
        this.zipCode = addressComponents[5];
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String toString() {
        return houseNumber + " " + streetName + " Apt " + apartmentNumber + ", " + city + ", " + state + " " + zipCode;
    }
}
