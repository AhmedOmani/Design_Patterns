public class Main {
    public static void main(String[] args) {

        Task task = new Task("Making nice footer.") ;
        ProjectManagment figma = new ProjectManagment(task) ;

        //States of tasks .
        figma.todoTask();
        figma.inprogressTask();
        figma.inreviewTask();
        figma.doneTask();
        figma.blockedTask();

    }
}