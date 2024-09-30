public class JSON implements IReport {
    String report ;

    public JSON(String report) {
        this.report = report;
    }

    @Override
    public String getReport() {
        return this.report;
    }
}
