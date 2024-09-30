public class ReportAdaptee implements ReportAdapter{
    ClientService clientService ;

    public ReportAdaptee(ClientService clientService) {
        this.clientService = clientService;
    }

    public IReport generateReport() {
        return convertToJSON(clientService.getCVSReport()) ;
    }

    public IReport convertToJSON(IReport report) {
        return new JSON(report.getReport());
    }
}
