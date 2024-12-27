package JAVA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class x015appointmentScheduler {
    LocalDateTime date;
    DateTimeFormatter pattern;
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        pattern = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        date = LocalDateTime.parse(appointmentDateDescription, pattern);
        return date;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        date = LocalDateTime.now();
        return date.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printerDY = DateTimeFormatter.ofPattern("d, yyyy");
        DateTimeFormatter printerHM = DateTimeFormatter.ofPattern("h:mm");
        String day = appointmentDate.getDayOfWeek().name().substring(0, 1).toUpperCase() + appointmentDate.getDayOfWeek().name().substring(1).toLowerCase();
        String month = appointmentDate.getMonth().name().substring(0, 1).toUpperCase() + appointmentDate.getMonth().name().substring(1).toLowerCase();
        String res = "You have an appointment on "+day+", "+month+" "+printerDY.format(appointmentDate)+", at "+printerHM.format(appointmentDate);
        
        return isAfternoonAppointment(appointmentDate) ? res+" PM." : res+" AM.";
    }

    public LocalDate getAnniversaryDate() {
        date = LocalDateTime.now();
        LocalDate res = LocalDate.of(date.getYear(), 9, 15);
        
        return res;
    }
}

/*
In this exercise you'll be working on an appointment scheduler for a beauty salon in New York that opened on September 15th in 2012:

1. Implement the AppointmentScheduler.schedule() method to parse a textual representation of an appointment date into the corresponding LocalDateTime.

2. Implement the AppointmentScheduler.hasPassed() method that takes an appointment date and checks if the appointment was somewhere in the past.

3. Implement the AppointmentScheduler.isAfternoonAppointment() method that takes an appointment date and checks if the appointment is in the afternoon (>= 12:00 and < 18:00).

4. Implement the AppointmentScheduler.getDescription() method that takes an appointment date and returns a description of that date and time.

5. Implement the AppointmentScheduler.getAnniversaryDate() method that returns this year's anniversary date, which is September 15th.
 */