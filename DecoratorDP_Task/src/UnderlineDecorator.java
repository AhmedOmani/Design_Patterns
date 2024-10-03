public class UnderlineDecorator extends Decorator implements TextProccessingSystem{

    public UnderlineDecorator(TextProccessingSystem decorator) {
        super(decorator);
    }

    @Override
    public String process() {
        return super.process() + " with underline";
    }
}
