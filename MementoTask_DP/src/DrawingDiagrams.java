public class DrawingDiagrams {

    private Diagram diagram ;

    DrawingDiagrams() {
        this.diagram =  new Diagram("" , "" , "") ;
    }

    public Diagram save() {
        return new Diagram(diagram.getContent() , diagram.getColor() , diagram.getBorder()) ;
    }

    public void restore(Diagram diagram) {
        this.diagram.setBorder(diagram.getBorder());
        this.diagram.setColor(diagram.getColor());
        this.diagram.setContent(diagram.getContent());
    }

    public Diagram getDiagram() {
        return this.diagram ;
    }

    public void setDiagram(Diagram diagram) {
        this.diagram = diagram ;
    }

    public void print() {
        System.out.println(this.getDiagram().getContent());
        System.out.println(this.getDiagram().getBorder());
        System.out.println(this.getDiagram().getColor());
        System.out.println();
    }
}
