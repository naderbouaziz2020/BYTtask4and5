public class Flight implements Command {
    private IAtc atcMediator;

    Flight(IAtc actMediator){
        this.atcMediator = actMediator;
    }
    @Override
    public void land() {
        if (atcMediator.isAvailable()){
            System.out.println("Landed successfully");
            atcMediator.setAvailablityStstus(false); // runway is occupied
        }
        else {
            System.out.println("Waiting for runway");
        }
    }
    public void readyToLand(){
        System.out.println("Landing initiated");
    }
    public void parked(){
        System.out.println("Flight is parked");
        atcMediator.setAvailablityStstus(true);
    }
}
