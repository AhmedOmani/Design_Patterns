public class GUIButtonComponent {
    private String color ;
    private String content ;
    private int xPostion ;
    private int yPosition ;

    public GUIButtonComponent(String color, String content, int xPostion, int yPosition) {
        this.color = color;
        this.content = content;
        this.xPostion = xPostion;
        this.yPosition = yPosition;
    }

    public GUIButtonComponent clone() {
        return new GUIButtonComponent(this.color , this.content , this.xPostion , this.yPosition)  ;
    }
    public String getColor() {
        return color;
    }

    public String getContent() {
        return content;
    }

    public int getxPostion() {
        return xPostion;
    }

    public int getyPosition() {
        return yPosition;
    }
}
