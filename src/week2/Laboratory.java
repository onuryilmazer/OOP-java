package week2;

public class Laboratory extends Room {
    private PracticalTraining[] practicalTrainings;

    Laboratory(int seats, Address address, PracticalTraining[] practicalTrainings) {
        setSeats(seats);
        setAddress(address);
        setPracticalTrainings(practicalTrainings);
    }

    public PracticalTraining[] getPracticalTrainings() { return practicalTrainings; }

    public void setPracticalTrainings(PracticalTraining[] practicalTrainings) { this.practicalTrainings = practicalTrainings; }
}
