package Lab10;

public class Attraction extends Place {
    private int costs;
    private String city;

    public Attraction(String name, String address, String province, String city, int costs) {
        super(name, address, province);
        this.costs = costs;
        this.city = city;

    }

    public int getCosts() {
        return costs;
    }

}
