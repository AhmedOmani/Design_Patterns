public class PersonalInformationChecksPipeline extends AbstractPipelineOperation {

    @Override
    public HandleResponse handle(Data data) {
        System.out.println("Personal Information Checking...");
        if (!data.isPersonalInfoChecks())
            return new HandleResponse(this , false) ; ;
        return super.handle(data) ;
    }

    @Override
    public String getReason() {
        return "Data Personal Information failure !!";
    }

}
