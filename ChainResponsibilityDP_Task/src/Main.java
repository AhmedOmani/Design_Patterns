public class Main {
    public static void main(String[] args) {

        Data data = new Data("Hello" , true , true , true , true) ;

        //Pipeline checking
        PipelineOperation size = new DataSizeChecksPipeline() ;
        PipelineOperation valid = new ValidationPipeline() ;
        PipelineOperation formatCheck = new FormattingChecksPipeline() ;
        PipelineOperation personal = new PersonalInformationChecksPipeline() ;

        //construct the chain
        valid.setNext(formatCheck) ;
        formatCheck.setNext(size);
        size.setNext(personal);

        BigDataPatch openAI = new BigDataPatch(valid) ;
        Response response = openAI.process(data) ;
        System.out.println(response.getStatus());

    }
}