package week2;

public abstract class Room {
    private int seats;
    private Address address;

    public int getSeats() { return seats; }

    public void setSeats(int seats) { this.seats = seats; }

    public Address getAddress() { return address; }

    public void setAddress(Address address) { this.address = address; }
}
