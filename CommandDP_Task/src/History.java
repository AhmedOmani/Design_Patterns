import java.util.Stack;

public class History {

    Stack<ICommand> prvCommand ;
    Stack<ICommand> nxtCommand ;

    public History() {
        prvCommand = new Stack<>() ;
        nxtCommand = new Stack<>() ;
    }

    public void setCommand(ICommand command) {
        prvCommand.push(command) ;
        nxtCommand.clear();
    }

    public ICommand undo() {
        if (!prvCommand.isEmpty()) {
            ICommand command = prvCommand.peek() ;
            nxtCommand.push(command) ;
            return prvCommand.pop() ;
        }
        return null ;
    }

    public ICommand redo() {
        if (!nxtCommand.isEmpty()) {
            ICommand command = nxtCommand.peek() ;
            prvCommand.push(command) ;
            return nxtCommand.pop() ;
        }
        return null ;
    }
}
