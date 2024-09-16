public class SpreadSheets implements DocumentHandler {
    @Override
    public void accept(DocumentHandlerVisitor documentHandlerVisitor) {
        documentHandlerVisitor.visit(this);
    }
}
