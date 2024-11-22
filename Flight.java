package ja7.airplaneticketsreservation;

public class Flight {

    private String Flightnumber;
    private City Departurecity;
    private City ArrivalCity;
    private String Duration;
    private Date flightDate;
    private String Airline;
    private Time Departuretime;
    private Time Arrivaltime;

    public Flight() {}

    public Flight(String Flightnumber, City Departurecity, City ArrivalCity, String Duration, Date flightDate, String Airline, Time Departuretime, Time Arrivaltime) {
        this.Flightnumber = Flightnumber;
        this.Departurecity = Departurecity;
        this.ArrivalCity = ArrivalCity;
        this.Duration = Duration;
        this.flightDate = flightDate;
        this.Airline = Airline;
        this.Departuretime = Departuretime;
        this.Arrivaltime = Arrivaltime;
    }

    public String getFlightnumber() {
        return Flightnumber;
    }

    public void setFlightnumber(String Flightnumber) {
        this.Flightnumber = Flightnumber;
    }

    public City getDeparturecity() {
        return Departurecity;
    }

    public void setDeparturecity(City Departurecity) {
        this.Departurecity = Departurecity;
    }

    public City getArrivalCity() {
        return ArrivalCity;
    }

    public void setArrivalCity(City ArrivalCity) {
        this.ArrivalCity = ArrivalCity;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getAirline() {
        return Airline;
    }

    public void setAirline(String Airline) {
        this.Airline = Airline;
    }

    public Time getDeparturetime() {
        return Departuretime;
    }

    public void setDeparturetime(Time Departuretime) {
        this.Departuretime = Departuretime;
    }

    public Time getArrivaltime() {
        return Arrivaltime;
    }

    public void setArrivaltime(Time Arrivaltime) {
        this.Arrivaltime = Arrivaltime;
    }

    @Override
    public String toString() {
        return "Flightnumber: " + Flightnumber + "\nFrom: " + Departurecity + " To: " + ArrivalCity 
                + "\nDuration: " + Duration + "\nFlight Date: " + flightDate 
                + "\nAirline: " + Airline + "\nDeparture Time: " + Departuretime 
                + "\nArrival Time: " + Arrivaltime + "\n-------------------------------";
    }
}
