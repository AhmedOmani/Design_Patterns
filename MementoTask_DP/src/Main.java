import javax.annotation.processing.SupportedSourceVersion;

public class Main {
    public static void main(String[] args) {

        Diagram sqaure = new Diagram("Sqaure" , "Blue" , "250") ;
        Diagram triangle = new Diagram("Triangle" , "Red" , "250") ;
        Diagram circle = new Diagram("circle" , "Yellow" , "250") ;

        DrawingDiagrams lucid = new DrawingDiagrams() ;

        History history = new History() ;

        lucid.setDiagram(sqaure);
        history.saveHistoryState(lucid.save());

        lucid.setDiagram(triangle);
        history.saveHistoryState(lucid.save());

        lucid.setDiagram(circle);
        history.saveHistoryState(lucid.save());

        //Circle State
        lucid.restore(history.undo());
        lucid.print();

        //Triangle State
        lucid.restore(history.undo());
        lucid.print();

        //Square State
        lucid.restore(history.undo());
        lucid.print();

        //Square State
        lucid.restore(history.redo());
        lucid.print();

        //Triangle State
        lucid.restore(history.redo());
        lucid.print();

        //Circle State
        lucid.restore(history.redo());
        lucid.print();

    }
}