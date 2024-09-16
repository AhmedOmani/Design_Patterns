public class Formatting implements DocumentHandlerVisitor {

    @Override
    public void visit(PresentationFiles presentationFiles) {
        System.out.println("Formatting for presentationFiles...");
    }

    @Override
    public void visit(SpreadSheets spreadSheets) {
        System.out.println("Formatting for spreadSheets...");
    }

    @Override
    public void visit(TextFiles textFiles) {
        System.out.println("Formatting for textFiles...");
    }
}
