public class Main {
    public static void main(String[] args) {

        MessageFormatterService MFS = new MessageFormatterService(new JSONMessageFormatter()) ;
        MFS.processCovertingMessage("Hello World!");
        System.out.println("Type of message is " + MFS.messageType()) ;

        System.out.println();

        MessageFormatterService MFS2 = new MessageFormatterService(new XMLMessageFormatter()) ;
        MFS2.processCovertingMessage("Hello World!");
        System.out.println("Type of message is " + MFS2.messageType()) ;

        System.out.println();

        MessageFormatterService MFS3 = new MessageFormatterService(new PLAINTEXTMessageFormatter()) ;
        MFS3.processCovertingMessage("Hello World!");
        System.out.println("Type of message is " + MFS3.messageType()) ;

    }
}