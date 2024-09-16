public interface DocumentHandlerVisitor {
    void visit(TextFiles textFiles) ;
    void visit(SpreadSheets spreadSheets) ;
    void visit(PresentationFiles presentationFiles) ;
}
