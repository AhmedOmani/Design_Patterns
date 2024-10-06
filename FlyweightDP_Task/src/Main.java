//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Text charcter = TextFactory.getText(TextType.CHARACTER) ;
        Text word = TextFactory.getText(TextType.WORD) ;
        Text paragraph = TextFactory.getText(TextType.PARAGRAPH) ;

        charcter.render("a" , 10 , 15);
        word.render("Omani" , 10 , 20) ;
        paragraph.render("Omani is the king" , 14 , 12) ;

    }
}