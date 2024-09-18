public interface PipelineOperation {
    void setNext(PipelineOperation pipelineOperation) ;
    HandleResponse handle(Data data) ;
    String getReason() ;
}
