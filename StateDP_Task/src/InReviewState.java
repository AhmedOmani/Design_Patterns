public class InReviewState implements TaskState {

    ProjectManagment projectManagment ;

    public InReviewState(ProjectManagment projectManagment) {
        this.projectManagment = projectManagment;
    }

    @Override
    public void todoTask() {
        System.out.println("We cant process this action in this phase");
    }

    @Override
    public void inprogressTask() {
        System.out.println("We cant process this action in this phase");
    }

    @Override
    public void inreviewTask() {
        System.out.println("We already in review state!");
    }

    @Override
    public void doneTask() {
        System.out.println("The task has been finished");
        projectManagment.changeState(new DoneState(projectManagment));
    }

    @Override
    public void blockedTask() {
        System.out.println("The task has been blocked for some reason!!");
        projectManagment.changeState(new BlockedState(projectManagment));
    }
}
