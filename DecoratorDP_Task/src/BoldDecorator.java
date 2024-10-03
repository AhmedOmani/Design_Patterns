public class BoldDecorator extends Decorator implements TextProccessingSystem{

    public BoldDecorator(TextProccessingSystem decorator) {
        super(decorator);
    }

    @Override
    public String process() {
        return super.process() + " with Bold";
    }

}
