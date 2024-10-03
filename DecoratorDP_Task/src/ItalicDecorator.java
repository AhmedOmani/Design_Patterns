public class ItalicDecorator extends Decorator implements TextProccessingSystem{

    public ItalicDecorator(TextProccessingSystem decorator) {
        super(decorator);
    }

    @Override
    public String process() {
        return super.process() + " with Italic";
    }

}
