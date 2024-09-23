public class CopyCommand implements ICommand {
    TextEditor reciever ;

    public CopyCommand(TextEditor reciever) {
        this.reciever = reciever;
    }

    @Override
    public void excute() {
        this.reciever.copy();
    }

    @Override
    public String getStatus() {
        return "Copied";
    }
}
