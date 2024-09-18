public class FormattingChecksPipeline extends AbstractPipelineOperation {
    @Override
    public HandleResponse handle(Data data) {
        System.out.println("Formatting Checking...");
        if (!data.isFormattingChecks())
            return new HandleResponse(this , false) ;
        return super.handle(data) ;
    }

    @Override
    public String getReason() {
        return "Data Formatting failure !!";
    }
}
