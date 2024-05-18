package Lab5.Task1;

public class EmailService {
    public void sendEmail(User user, String subject, String body) {
        String username = user.getUsername();
        String email = user.getEmail();

        System.out.println("Sending email to " + username + " at " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);

    }
}
