//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TowerMediator egyptAirport = new CoordinationSystem() ;
        Airplane egyptAirplane = new Airplane("EgyptAirplane" , egyptAirport) ;
        Airplane qatarAirplane = new Airplane("QatarAirplane" , egyptAirport) ;

        egyptAirplane.takeoffRequest("10 AM");
        qatarAirplane.takeoffRequest("10 AM");

        qatarAirplane.landingRequest("1 AM");
        egyptAirplane.landingRequest("1 AM");

    }
}
