package command;

public class DeleteCommand implements ICommand{
    TextEditor reciever ;

    public DeleteCommand(TextEditor reciever) {
        this.reciever = reciever;
    }

    @Override
    public void excute() {
        this.reciever.delete();
    }

    @Override
    public String getStatus() {
        return "Deleted";
    }
}
