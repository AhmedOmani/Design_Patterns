//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AirlineProvider egypt = new EgyptAirlineProvider() ;
        AirlineProvider turkish = new TurkishAirlineProvider() ;

        User Omani = new User("Omani") ;
        User Gar7i = new User("Gar7i") ;

        egypt.addUser(Omani , new Premuim());
        egypt.booking(Omani , 1200);

        turkish.addUser(Gar7i , new Basic());
        turkish.booking(Gar7i , 1200);
    }
}