public class ClientService {
    private ReportService reportService ;

    public ClientService(ReportService reportService) {
        this.reportService = reportService;
    }

    public void generateCVSReport(IReport report) {
        reportService.generateCVSReport(report) ;
    }

    public IReport getCVSReport() {
        return reportService.getCVSReport() ;
    }

}
