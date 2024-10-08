public class SessionManagerSingleton {

    static SessionManagerSingleton instance ;
    String session ;
    private SessionManagerSingleton() {}

    public static SessionManagerSingleton getInstance() {
        if (instance == null)
            instance = new SessionManagerSingleton() ;
        return instance ;
    }

    public void createSession() {
        session = "3223###" ;
    }

    public String getSession() {
        return this.session ;
    }
}
