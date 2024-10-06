public class Text {

    private String font ;
    private int size ;
    private String color ;
    private String style ;

    public Text(String font, int size, String color, String style) {
        this.font = font;
        this.size = size;
        this.color = color;
        this.style = style;
    }

    public void render(String content , int x , int y) {
        System.out.println("Text is " + content + " , at position : " + x + " , " + y);
    }
}
