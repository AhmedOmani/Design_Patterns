public class DataSizeChecksPipeline extends AbstractPipelineOperation {
    @Override
    public HandleResponse handle(Data data) {
        System.out.println("Data Size Checking...");
        if (!data.isDataSizeChecks())
            return new HandleResponse(this , false) ;
        return super.handle(data) ;
    }

    @Override
    public String getReason() {
        return "Data Size failure !!";
    }
}
