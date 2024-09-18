public abstract class AbstractPipelineOperation implements PipelineOperation {

    PipelineOperation pipelineOperation ;
    @Override
    public void setNext(PipelineOperation pipelineOperation) {
        this.pipelineOperation = pipelineOperation ;
    }

    @Override
    public HandleResponse handle(Data data) {
        if (pipelineOperation != null)
            return pipelineOperation.handle(data) ;
        return new HandleResponse(null , true) ;
    }

}
