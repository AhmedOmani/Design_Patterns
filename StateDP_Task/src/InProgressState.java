public class InProgressState implements TaskState {

    ProjectManagment projectManagment ;

    public InProgressState(ProjectManagment projectManagment) {
        this.projectManagment = projectManagment;
    }

    @Override
    public void todoTask() {
        System.out.println("we already picked a task");
    }

    @Override
    public void inprogressTask() {
        System.out.println("we already in progress phase!!");
    }

    @Override
    public void inreviewTask() {
        System.out.println("The task goes to review state, be tuned!!");
        projectManagment.changeState(new InReviewState(projectManagment));
    }

    @Override
    public void doneTask() {
        System.out.println("You should in review phase first!");
    }

    @Override
    public void blockedTask() {
        System.out.println("The task has been blocked for some reason!!");
        projectManagment.changeState(new BlockedState(projectManagment));
    }
}
