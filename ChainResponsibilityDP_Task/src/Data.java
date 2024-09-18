public class Data {

    private String data ;
    private boolean isValid ;
    private boolean formattingChecks ;
    private boolean dataSizeChecks ;
    private boolean personalInfoChecks ;

    public Data(String data, boolean isValid, boolean formattingChecks, boolean dataSizeChecks, boolean personalInfoChecks) {
        this.data = data;
        this.isValid = isValid;
        this.formattingChecks = formattingChecks;
        this.dataSizeChecks = dataSizeChecks;
        this.personalInfoChecks = personalInfoChecks;
    }

    public String getData() {
        return data;
    }

    public boolean isValid() {
        return isValid;
    }

    public boolean isFormattingChecks() {
        return formattingChecks;
    }

    public boolean isDataSizeChecks() {
        return dataSizeChecks;
    }

    public boolean isPersonalInfoChecks() {
        return personalInfoChecks;
    }
}
