public final class Address {

    private final String cityName;
    private final int zipCode;
    private final String streetName;
    private final int buildingNumber;
    private final char buildingLetter;
    private final int apartmentNumber;
    public Address EMPTY_ADDRESS = null;


    Address() {
        EMPTY_ADDRESS = new Address("", 0, "", 0, ' ', 0);
        this.cityName = EMPTY_ADDRESS.cityName;
        this.zipCode = EMPTY_ADDRESS.zipCode;
        this.streetName = EMPTY_ADDRESS.streetName;
        this.buildingNumber = EMPTY_ADDRESS.buildingNumber;
        this.buildingLetter = EMPTY_ADDRESS.buildingLetter;
        this.apartmentNumber = EMPTY_ADDRESS.apartmentNumber;
    }
    Address (String cityName, int zipCode, String streetName, int buildingNumber, char buildingLetter, int apartmentNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }


    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
