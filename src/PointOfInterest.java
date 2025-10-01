


public class PointOfInterest {

    public String name;
    public String address;
    public String tags;
    public GeoLocation location;


    public PointOfInterest(String name, String address, String tags, GeoLocation location) {
        this.name = name;
        this.address = address;
        this.tags = tags;
        this.location = location;

    }

    public String getName() {
        return name;
    }

    public String getTags() {
        return tags;
    }

    public String getAddress() {
        return address;
    }

    public GeoLocation getLocation() {
        return location;
    }

    public boolean match(String search) {
        return name.toLowerCase().contains(search.toLowerCase()) ||
                tags.toLowerCase().contains(search.toLowerCase());
    }

    public PointOfInterest(double latitude, double longitude){
        this.location = new GeoLocation(latitude,  longitude);

    }
    public double distanceFrom(GeoLocation spot) {
        return this.location.distanceFrom(spot);

    }

}

