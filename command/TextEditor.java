package command;

public class TextEditor {

    String text ;
    ICommand curCommand ;

    public TextEditor(String text) {
        this.text = text;
    }

    public CommandMemento saveCommand(ICommand command) {
        curCommand = command ;
        return new CommandMemento(command) ;
    }

    public void restoreCommand(CommandMemento command) {
        this.curCommand = command.getCommand() ;
    }

    public void copy() {
        System.out.println("Copied : " + text);
    }

    public void cut() {
        System.out.println("Cut : " + text);
    }

    public void delete() {
        System.out.println("Deleted");
    }

    public ICommand getCurCommand() {
        return this.curCommand ;
    }
}
