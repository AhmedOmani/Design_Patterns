public class Airplane {

    private String name ;
    TowerMediator towerMediator ;

    public Airplane(String name , TowerMediator towerMediator) {
        this.name = name;
        this.towerMediator = towerMediator ;
    }

    public void takeoffRequest(String time) {
        towerMediator.takeoffProcess(time , this) ;
    }

    public void takeoffResponse(String response , Airplane airplane) {
        System.out.println("Take off response to : " + airplane.getName());
        System.out.println(response);
    }

    public void landingRequest(String time) {
        towerMediator.landingProcess(time , this) ;
    }

    public void landingResponse(String response , Airplane airplane) {
        System.out.println("landing response to : " + airplane.getName());
        System.out.println(response);
    }

    public String getName() {
        return name;
    }
}
