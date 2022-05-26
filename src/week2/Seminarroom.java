package week2;

public class Seminarroom extends Room{
    private Exercise[] exercises;

    Seminarroom(int seats, Address address, Exercise[] exercises) {
        setSeats(seats);
        setAddress(address);
        setExercises(exercises);
    }

    public Exercise[] getExercises() { return exercises; }

    public void setExercises(Exercise[] exercises) { this.exercises = exercises; }
}
