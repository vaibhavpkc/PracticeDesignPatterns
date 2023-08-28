package Structural.FacadeDesignPattern;

import java.util.Random;

// TicketSystem class responsible for ticket-related operations
class TicketSystem {
    private Random random = new Random();
    public boolean validateAvailability(String event) {
        // Check if the event is available for booking
        return true; // For demonstration purposes, assume always available
    }

    public void createTicket(int price, User user, String event) {
        // Create a ticket for the user and event
        System.out.println("Created ticket for " + user.getName() + " to " + event);
    }


    public int getTicketNumber() {
        // Return a unique ticket number

        return random.nextInt(100) + 1;
    }
}
