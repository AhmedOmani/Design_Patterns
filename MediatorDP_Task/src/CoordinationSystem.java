import java.util.HashMap;
import java.util.Map;

public class CoordinationSystem implements TowerMediator {

    private Map<String , Airplane> takeoffSchedule ;
    private Map<String , Airplane> landingSchedule ;

    public CoordinationSystem() {

        takeoffSchedule = new HashMap<>() ;
        landingSchedule = new HashMap<>() ;
    }

    @Override
    public void takeoffProcess(String time , Airplane airplane) {
        if (!takeoffSchedule.containsKey(time)) {
            takeoffSchedule.put(time , airplane) ;
            airplane.takeoffResponse("Take off at " + time  + " has been scheduled!" , airplane) ;
        } else {
            airplane.takeoffResponse("Cant takeoff at " + time + ", wait until another time" , airplane);
        }
    }

    @Override
    public void landingProcess(String time , Airplane airplane) {
        if (!landingSchedule.containsKey(time)) {
            landingSchedule.put(time , airplane) ;
            airplane.landingResponse("Landing at " + time  + " has been scheduled!" , airplane);
        } else {
            airplane.landingResponse("Cant land at " + time + ", wait until another time" , airplane);
        }
    }
}
