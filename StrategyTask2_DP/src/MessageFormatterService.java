public class MessageFormatterService {

    private MessageFormatter messageFormatter ;

    MessageFormatterService(MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter ;
    }

    public void processCovertingMessage(String message) {
        messageFormatter.convertMessage(message);
    }

    public MessageType messageType() {
        return messageFormatter.getType() ;
    }

}
