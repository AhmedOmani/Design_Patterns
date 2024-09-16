import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<DocumentHandler> list = List.of(new TextFiles() ,
                                             new SpreadSheets() ,
                                             new PresentationFiles()) ;


        list.forEach(DocumentHandler -> {
            DocumentHandler.accept(new CountingWords());
            DocumentHandler.accept(new ExtractingText());
            DocumentHandler.accept(new Formatting());
        });
    }
}