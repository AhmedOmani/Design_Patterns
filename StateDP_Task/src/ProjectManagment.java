import com.sun.source.tree.ReturnTree;

import java.util.stream.StreamSupport;

public class ProjectManagment {

    private Task task ;
    private TaskState state ;

    public ProjectManagment(Task task) {
        this.task = task ;
        state = new BackLogState(this) ;
    }

    public void changeState(TaskState state) {
        this.state = state ;
    }

    public void todoTask() {
        state.todoTask();
    }

    public void inprogressTask() {
        state.inprogressTask();
    }

    public void inreviewTask() {
        state.inreviewTask();
    }

    public void doneTask() {
        state.doneTask();
    }

    public void blockedTask() {
        state.blockedTask();
    }

}
