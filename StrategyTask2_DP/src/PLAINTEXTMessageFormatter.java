public class PLAINTEXTMessageFormatter implements MessageFormatter {

    public void convertMessage(String message) {
        System.out.println("Proccessing To PLAIN TEXT..");
        System.out.println(message);
    }

    public MessageType getType() {
        return MessageType.PLAIN_TEXT ;
    }
}
