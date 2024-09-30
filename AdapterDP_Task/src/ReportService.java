public class ReportService {
    IReport report ;

    public void generateCVSReport(IReport report) {
        this.report = report ;
    }

    public IReport getCVSReport() {
        return this.report ;
    }

}
