public class JSONMessageFormatter implements MessageFormatter{

    public void convertMessage(String message) {
        System.out.println("Proccessing To JSON..");
        System.out.println(message);
    }

    public MessageType getType() {
        return MessageType.JSON ;
    }
}
