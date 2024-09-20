public class DoneState implements TaskState{

    ProjectManagment projectManagment ;

    public DoneState(ProjectManagment projectManagment) {
        this.projectManagment = projectManagment;
    }

    @Override
    public void todoTask() {
        System.out.println("We cant pick the task after it finished");
    }

    @Override
    public void inprogressTask() {
        System.out.println("No one will progress the task after it finished!!");
    }

    @Override
    public void inreviewTask() {
        System.out.println("We cant review the task after in finished!!");
    }

    @Override
    public void doneTask() {
        System.out.println("The Task has been finished");
    }

    @Override
    public void blockedTask() {
        System.out.println("We cant block the task after it finished!!");
    }
}
