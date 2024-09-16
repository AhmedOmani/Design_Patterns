public class ExtractingText implements DocumentHandlerVisitor{
    @Override
    public void visit(TextFiles textFiles) {
        System.out.println("Extracting Text for textFiles...");
    }

    @Override
    public void visit(SpreadSheets spreadSheets) {
        System.out.println("Extracting Text for spreadSheets...");
    }

    @Override
    public void visit(PresentationFiles presentationFiles) {
        System.out.println("Extracting Text for presentationFiles...");
    }
}
