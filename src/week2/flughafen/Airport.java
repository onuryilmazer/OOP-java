package week2.flughafen;

public class Airport {
    private Flight[] flights;
    private int numberOfFlights = 0;

    public int getNumberOfFlights() {
        return numberOfFlights;
    }

    Airport(int maxFlights) {
        if (maxFlights <= 0) {
            System.out.println("The number of managed flights can't be smaller than one.");
            maxFlights = 1;
        }

        flights = new Flight[maxFlights];
        numberOfFlights = 0;
    }

    public void addNewFlight(Flight flight) {
        if (numberOfFlights >= flights.length) {
            System.out.println("Error: Maximum number of flights already achieved. New flight won't be added.");
            return;
        }

        boolean flightAlreadyAdded = false;
        for (Flight existingFlight : flights) {
            if (existingFlight == null) {
                continue;
            }
            if (existingFlight.getFlightNumber() == flight.getFlightNumber()) {
                flightAlreadyAdded = true;
                System.out.println("Error: This flight was already added");
                break;
            }
        }

        if (!flightAlreadyAdded) {
            flights[numberOfFlights] = flight;
            numberOfFlights++;
        }
    }

    public void removeFlight(int flightNumber) {
        Flight[] updatedFlights = new Flight[flights.length];

        int counter = 0;
        for (Flight existingFlight : flights) {
            if (existingFlight==null) {
                continue;
            }
            if (existingFlight.getFlightNumber() == flightNumber) {
                continue;
            }

            updatedFlights[counter] = existingFlight;
            counter++;
        }

        numberOfFlights = counter;
        flights = updatedFlights;
    }

    private void printFlight(Flight flight, boolean inbound) {
        if (inbound) {
            System.out.println("Flight no: " + flight.getFlightNumber() + " Arrival: " + flight.getTime() + " Gate: " + flight.getGate() + " From: " + flight.getLocation());
        }
        else {
            System.out.println("Flight no: " + flight.getFlightNumber() + " Departure: " + flight.getTime() + " Gate: " + flight.getGate() + " To: " + flight.getLocation());
        }
    }

    public void listDeparturesOnScreen() {
        for(Flight flight : flights) {
            if (flight == null) {
                continue;
            }
            if(!flight.getInOut()) {  //inOut == false -> departure.
                printFlight(flight, false);
            }
        }
    }

    public void listArrivalsOnScreen() {
        for(Flight flight : flights) {
            if (flight == null) {
                continue;
            }
            if(flight.getInOut()) {  //inOut == true -> arrival.
                printFlight(flight, true);
            }
        }
    }

}
