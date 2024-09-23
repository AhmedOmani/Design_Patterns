package command;

public class CutCommand implements ICommand{

    TextEditor reciever ;

    public CutCommand(TextEditor reciever) {
        this.reciever = reciever;
    }

    @Override
    public void excute() {
        this.reciever.cut();
    }

    @Override
    public String getStatus() {
        return "Cut";
    }
}
