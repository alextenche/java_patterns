package factory;

public class ZoneFactory {

    public Zone createZone(String zoneId) {

        Zone zone = null;

        switch (zoneId) {
            case "US/Eastern":
                zone = new ZoneUSEastern();
                break;
            case "US/Central":
                zone = new ZoneUSCentral();
                break;
            case "US/Mountain":
                zone = new ZoneUSMountain();
                break;
            case "US/Pacific":
                zone = new ZoneUSPacific();
                break;
        }
        return zone;
    }

}
