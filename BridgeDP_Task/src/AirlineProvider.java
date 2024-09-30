import java.util.HashMap;
import java.util.Map;

public abstract class AirlineProvider {

    Map<User , LoyalityProgram> users ;

    public AirlineProvider() {
        this.users = new HashMap<>() ;
    }

    public void addUser(User user , LoyalityProgram type) {
        users.put(user , type) ;
    }

    public void booking(User user , double price) {
        price = users.get(user).discount(price) ;
        System.out.println("Booked ticket with " + price);
    }

}
