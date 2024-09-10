public class NotificationManagment {
    NotificationService notifications ;

    public NotificationManagment(NotificationService notifications) {
        this.notifications = notifications;
    }

    public void proccessNotification(User user , String messege){
        notifications.proccessNotification(user , messege) ;
    }
}
