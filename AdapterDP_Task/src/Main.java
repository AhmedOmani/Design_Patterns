//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ReportService reportService = new ReportService() ;

        ClientService clientService = new ClientService(reportService) ;
        clientService.generateCVSReport(new CVS("Report about your skills.."));

        DashboardService dashboardService = new DashboardService() ;

        ReportAdapter adapter = new ReportAdaptee(clientService) ;
        dashboardService.previewData(adapter.generateReport()) ;

    }
}