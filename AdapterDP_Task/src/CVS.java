public class CVS implements IReport {
    String report ;

    public CVS(String report) {
        this.report = report;
    }

    @Override
    public String getReport() {
        return report ;
    }
}
