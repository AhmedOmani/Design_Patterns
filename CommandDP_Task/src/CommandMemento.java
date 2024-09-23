public class CommandMemento {

    private ICommand command ;

    public CommandMemento(ICommand command) {
        this.command = command;
    }

    public ICommand getCommand() {
        return command;
    }
}
