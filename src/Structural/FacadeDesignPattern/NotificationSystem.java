package Structural.FacadeDesignPattern;

class NotificationSystem {
    public void sendEmail(User user, int ticketNumber) {
        // Send an email notification to the user
        System.out.println("Sent email notification to " + user.getName() + " for ticket #" + ticketNumber);
    }

    public void sendSms(User user, int ticketNumber) {
        // Send an SMS notification to the user
        System.out.println("Sent SMS notification to " + user.getName() + " for ticket #" + ticketNumber);
    }
}
