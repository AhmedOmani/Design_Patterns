public class PresentationFiles implements DocumentHandler {
    @Override
    public void accept(DocumentHandlerVisitor documentHandlerVisitor) {
        documentHandlerVisitor.visit(this);
    }
}
