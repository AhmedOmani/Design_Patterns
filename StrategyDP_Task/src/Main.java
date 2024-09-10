public class Main {
    public static void main(String[] args) {

        User Jack = new User("01212209469" , "Jack@gmail.com" , "Jack44") ;

        NotificationManagment notificationManagmentEmail = new NotificationManagment(new EmailNotificationService()) ;
        NotificationManagment notificationManagmentSMS = new NotificationManagment(new SMSNotificationService()) ;
        NotificationManagment notificationManagmentFaceBook = new NotificationManagment(new FaceBookNotificationService()) ;

        notificationManagmentEmail.proccessNotification(Jack , "Be kind withyourself");
        System.out.println();

        notificationManagmentSMS.proccessNotification(Jack , "Be kind withyourself");
        System.out.println();

        notificationManagmentFaceBook.proccessNotification(Jack , "Be kind withyourself");
        System.out.println();
    }
}