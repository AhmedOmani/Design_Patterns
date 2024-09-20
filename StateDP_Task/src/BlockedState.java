public class BlockedState implements TaskState{

    ProjectManagment projectManagment ;

    public BlockedState(ProjectManagment projectManagment) {
        this.projectManagment = projectManagment;
    }

    @Override
    public void todoTask() {
        System.out.println("The task is in blocked state , we cant go further!!");
    }

    @Override
    public void inprogressTask() {
        System.out.println("The task is in blocked state , we cant go further!!");
    }

    @Override
    public void inreviewTask() {
        System.out.println("The task is in blocked state , we cant go further!!");
    }

    @Override
    public void doneTask() {
        System.out.println("The task is in blocked state , we cant go further!!");
    }

    @Override
    public void blockedTask() {
        System.out.println("The task already blocked!!");
    }
}
