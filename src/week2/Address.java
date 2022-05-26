package week2;

public class Address {
    private String street;
    private String postcode;
    private String city;

    Address(String street, String postcode, String city) {
        setStreet(street);
        setPostcode(postcode);
        setCity(city);
    }


    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public String getPostcode() { return postcode; }

    public void setPostcode(String postcode) { this.postcode = postcode; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }
}
