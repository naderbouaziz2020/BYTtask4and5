public interface IAtc {

    public void registerFlight(Flight flight);
    public void registerRunway(Runway runway);
    public void setAvailablityStstus(Boolean status);
    public Boolean isAvailable();
}
