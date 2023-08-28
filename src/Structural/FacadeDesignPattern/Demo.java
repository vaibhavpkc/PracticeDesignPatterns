package Structural.FacadeDesignPattern;

import java.awt.print.Book;

public class Demo {
    public static void main(String[] args) {
//        How Facade Design Pattern helps.
//        The client here has no knowledge of the internal communication of the classes.
        User user = new User("vaibhav","vaibhav@gmail.com", 123456789);
        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.createBooking(user);

/*
//        Without Facade Design Pattern.
//        The client class here has knowledge of so many classes. And it has to interact with so many subsystems.
        User user = new User("vaibhav","vaibhav@gmail.com", 123456789);
        TicketSystem ts = new TicketSystem();
//        first service
        boolean isBookingPossible = ts.validateAvailability("movie");
        if(isBookingPossible){
            ts.createTicket(100,user,"movie");
//            second service call.
            PaymentSystem ps = new PaymentSystem();
            ps.chargeCard();
//            third service being called.
            NotificationSystem ns =new NotificationSystem();
            ns.sendEmail(user,ts.getTicketNumber());
            ns.sendSms(user,ts.getTicketNumber());
        }*/


    }

}
