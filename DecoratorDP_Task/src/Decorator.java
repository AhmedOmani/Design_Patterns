public class Decorator implements TextProccessingSystem {

    private TextProccessingSystem decorator ;

    public Decorator(TextProccessingSystem decorator) {
        this.decorator = decorator;
    }

    @Override
    public String process() {
        return decorator.process() ;
    }
}
