package week2;

public class Auditorium extends Room {
    private Lecture[] lectures;

    Auditorium(int seats, Address address, Lecture[] lectures) {
        setSeats(seats);
        setAddress(address);
        setLectures(lectures);
    }

    public Lecture[] getLectures() { return lectures; }

    public void setLectures(Lecture[] lectures) { this.lectures = lectures; }
}
