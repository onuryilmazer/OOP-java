package week2.flughafen;

public class Flight {
    private int flightNumber;
    private String location;
    private String gate;
    private String time;
    private boolean inOut;
    //true if inbound, false if outbound flight.
    //This variable should actually be named something like "isInbound", as it makes no sense for something called "inOut" to be true or false
    //but this structure was provided in the question so I'm adhering to it...

    Flight (int flightNumber, String location, String gate, String time, boolean inOut) {
        setFlightNumber(flightNumber);
        setLocation(location);
        setGate(gate);
        setTime(time);
        setInOut(inOut);
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean getInOut() {
        return inOut;
    }

    public void setInOut(boolean inOut) {
        this.inOut = inOut;
    }
}
