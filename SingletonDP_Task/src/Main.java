public class Main {
    public static void main(String[] args) {

        SessionManagerSingleton session = SessionManagerSingleton.getInstance() ;
        session.createSession();
        System.out.println(session.getSession());

    }
}