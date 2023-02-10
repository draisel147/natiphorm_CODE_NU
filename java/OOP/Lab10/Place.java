package Lab10;

public class Place {
    private String name;
    private String address;
    private String province;

    public Place(String name, String address, String province) {
        this.name = name;
        this.address = address;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getProvince() {
        return province;
    }

    public boolean equals(Place other) {
        return this.name.equals(other.name) && this.address.equals(other.address)
                && this.province.equals(other.province);
    }

    public String toString() {
        return name + address + province;
    }

}
