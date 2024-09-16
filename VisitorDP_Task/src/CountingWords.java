public class CountingWords implements DocumentHandlerVisitor {

    @Override
    public void visit(PresentationFiles presentationFiles) {
        System.out.println("Counting words for presentationFiles...");
    }

    @Override
    public void visit(SpreadSheets spreadSheets) {
        System.out.println("Counting words for spreadSheets...");
    }

    @Override
    public void visit(TextFiles textFiles) {
        System.out.println("Counting words for textFiles...");
    }
}
