//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TextProccessingSystem textWithBoldAndUnderline = new BoldDecorator(new UnderlineDecorator(new Text("lol")));
        System.out.println(textWithBoldAndUnderline.process()) ;

        TextProccessingSystem textWithBoldAndItalic = new BoldDecorator(new ItalicDecorator(new Text("lol")));
        System.out.println(textWithBoldAndItalic.process()) ;

        TextProccessingSystem textWithBoldAndItalicAndUnderline = new BoldDecorator(new ItalicDecorator(new UnderlineDecorator(new Text("lol"))));
        System.out.println(textWithBoldAndItalicAndUnderline.process()) ;
    }
}