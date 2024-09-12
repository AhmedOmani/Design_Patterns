public class XMLMessageFormatter implements MessageFormatter {
    public void convertMessage(String message) {
        System.out.println("Proccessing To XML..");
        System.out.println(message);
    }

    public MessageType getType() {
        return MessageType.XML ;
    }
}
