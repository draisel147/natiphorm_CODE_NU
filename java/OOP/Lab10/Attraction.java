package Lab10;

public class Attraction extends Place {
    private String attractionType;
    private int entryTicketPrice;

    public Attraction(String n, String add, String pro, String type, int price) {
        super(n, add, pro);
        attractionType = type;
        entryTicketPrice = price;

    }

    public String getAttractionType() {
        return attractionType;
    }

    public int getEntryTicketPrice() {
        return entryTicketPrice;
    }

    public boolean isFreeEntry() {
        return entryTicketPrice == 0;
    }
}
