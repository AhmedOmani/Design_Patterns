public class HandleResponse {
    private PipelineOperation pipelineOperation ;
    private boolean status ;

    public HandleResponse(PipelineOperation pipelineOperation, boolean status) {
        this.pipelineOperation = pipelineOperation;
        this.status = status;
    }

    public PipelineOperation getPipelineOperation() {
        return pipelineOperation;
    }

    public boolean isStatus() {
        return status;
    }
}
