public class BackLogState implements TaskState {

    ProjectManagment projectManagment ;

    public BackLogState(ProjectManagment projectManagment) {
        this.projectManagment = projectManagment;
    }

    @Override
    public void todoTask() {
        System.out.println("The task now is picked by someone..");
        projectManagment.changeState(new ToDoState(projectManagment));
    }

    @Override
    public void inprogressTask() {
        System.out.println("We cant process this action in this phase");
    }

    @Override
    public void inreviewTask() {
        System.out.println("We cant process this action in this phase");
    }

    @Override
    public void doneTask() {
        System.out.println("We cant process this action in this phase");
    }

    @Override
    public void blockedTask() {
        System.out.println("The task has been blocked for some reason!!");
        projectManagment.changeState(new BlockedState(projectManagment));
    }
}
