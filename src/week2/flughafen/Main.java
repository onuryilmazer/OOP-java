package week2.flughafen;

public class Main {
    public static void main(String args[]) {
        Airport airport1 = new Airport(3);

        airport1.addNewFlight(new Flight(1, "Sylt", "B1", "15:00", false));
        airport1.addNewFlight(new Flight(1, "Sylt", "B1", "15:00", false));  //adding twice.

        airport1.addNewFlight(new Flight(2, "Amsterdam", "B2", "15:00", true));
        airport1.addNewFlight(new Flight(3, "Paris", "B3", "15:00", true));
        airport1.addNewFlight(new Flight(4, "Paris", "B4", "16:00", true));

        System.out.println("-------------------------");

        airport1.listDeparturesOnScreen();
        airport1.listArrivalsOnScreen();

        System.out.println("-------------------------");

        airport1.removeFlight(3);
        airport1.removeFlight(3); //removing twice.
        airport1.listDeparturesOnScreen();
        airport1.listArrivalsOnScreen();
    }
}
