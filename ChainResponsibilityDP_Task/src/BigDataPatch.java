public class BigDataPatch {

    PipelineOperation pipelineOperation ;

    public BigDataPatch(PipelineOperation pipelineOperation) {
        this.pipelineOperation = pipelineOperation;
    }

    public Response process(Data data) {
        HandleResponse res = pipelineOperation.handle(data) ;
        if (!res.isStatus())
            return new Response(res.getPipelineOperation().getReason()) ;
        return new Response("Process Completed, Go Ahead..") ;
    }
}
