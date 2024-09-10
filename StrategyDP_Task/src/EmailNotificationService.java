public class EmailNotificationService implements NotificationService {

    public void proccessNotification(User user , String messege) {
        System.out.println("Sending message: " + messege);
        System.out.println("to user: " + user.getEmail());
    }

}
