public class Text implements TextProccessingSystem{
    private String text ;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String process() {
        return text;
    }

    public String getText() {
        return text;
    }
}
