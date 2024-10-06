import java.util.HashMap;
import java.util.Map;

public class TextFactory {

    private static Map<TextType , Text> texts = new HashMap<>() ; ;

    private TextFactory() {}

    public static Text getText(TextType textType) {

        Text text = null ;

        if (texts.containsKey(textType)) {return texts.get(textType) ;}

        switch (textType) {
            case CHARACTER -> {
                text = new Text("Arial", 12, "Black", "Regular");
            }

            case WORD -> {
                text = new Text("Times New Roman", 14, "Blue", "Bold");
            }

            case PARAGRAPH -> {
                text = new Text("Verdana", 16, "Green", "Italic");
            }
        }

        if (text == null) throw new RuntimeException() ;
        texts.put(textType , text) ;
        return text ;

    }
}
