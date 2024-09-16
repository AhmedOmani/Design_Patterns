public class TextFiles implements DocumentHandler{
    @Override
    public void accept(DocumentHandlerVisitor documentHandlerVisitor) {
        documentHandlerVisitor.visit(this);
    }
}
