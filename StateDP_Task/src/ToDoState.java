public class ToDoState implements TaskState {

    ProjectManagment projectManagment ;

    public ToDoState(ProjectManagment projectManagment) {
        this.projectManagment = projectManagment;
    }

    @Override
    public void todoTask() {
        System.out.println("The task already in to-do state!");
    }

    @Override
    public void inprogressTask() {
        System.out.println("The task now is in progressing..");
        projectManagment.changeState(new InProgressState(projectManagment));
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
