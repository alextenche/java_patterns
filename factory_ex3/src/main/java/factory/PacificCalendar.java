package factory;

import java.util.List;

public class PacificCalendar extends Calendar {

    public PacificCalendar(ZoneFactory zoneFactory) {
        zone = zoneFactory.createZone("US/Pacific");
    }

    @Override
    public void createCalendar(List<String> appointments) {
        System.out.println("making the calendar");
    }
}
