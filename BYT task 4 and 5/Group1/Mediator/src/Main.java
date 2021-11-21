public class Main {
    public static void main (String[] args){
        IAtc atcMediator = new Atc();
        Runway runway = new Runway(atcMediator);

        Flight flight111 = new Flight(atcMediator);
        Flight flight222 = new Flight(atcMediator);

        atcMediator.registerFlight(flight111);
        atcMediator.registerRunway(runway);

        flight111.readyToLand();
        runway.land();
        flight111.land();

        flight222.land();

        flight111.parked();
    }
}
