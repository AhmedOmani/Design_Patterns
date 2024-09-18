public class ValidationPipeline extends AbstractPipelineOperation {
    @Override
    public HandleResponse handle(Data data) {
        System.out.println("Validation Checking...");
        if (!data.isValid())
            return new HandleResponse(this , false) ;
        return super.handle(data) ;
    }

    @Override
    public String getReason() {
        return "Data Validation failure !!";
    }
}
