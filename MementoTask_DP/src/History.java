import java.util.Stack;

public class History {

    private Stack<Diagram> prvState ;
    private Stack<Diagram> nxtState ;

    public History() {
        prvState = new Stack<>() ;
        nxtState = new Stack<>() ;
    }

    public void saveHistoryState(Diagram diagram) {
        prvState.push(diagram) ;
        nxtState.clear();
    }

    public Diagram undo() {
        if (!prvState.isEmpty()) {
            nxtState.push(prvState.peek()) ;
            return prvState.pop() ;
        }
        return null ;
    }

    public Diagram redo() {
        if (!nxtState.isEmpty()) {
            prvState.push(nxtState.peek()) ;
            return nxtState.pop() ;
        }
        return null ;
    }
}

