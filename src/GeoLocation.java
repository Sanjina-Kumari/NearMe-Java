/**
 * This class stores information about a location on Earth.  Locations are
 * specified using latitude and longitude.  The class includes a method for
 * computing the distance between two locations.
 * 
 * @author Stuart Reges, David Wolff
 */
public class GeoLocation {
	
    public static final double RADIUS = 3963.1676;  // Earth radius in miles

    private final double latitude;
    private final double longitude;
    double ShortestDistance;

    /**
     * Constructs a GeoLocation object with given latitude and longitude
     * 
     * @param theLatitude latitude in degrees
     * @param theLongitude longitude in degrees
     */
    public GeoLocation(double theLatitude, double theLongitude) {
        latitude = theLatitude;
        longitude = theLongitude;
    }

    /**
     * Returns the latitude of this GeoLocation
     * @return the latitude of this GeoLocation
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Returns the longitude of this GeoLocation
     * @return the longitude of this GeoLocation
     */
    public double getLongitude() { return longitude; }

    /**
     * Returns a String representation of this GeoLocation
     * @return a String representation of this GeoLocation
     */
    @Override
    public String toString() {
        return "latitude: " + latitude + ", longitude: " + longitude;
    }

    /**
     * Returns the distance in miles between this GeoLocation and the given
     * other GeoLocation.  Use the "Haversine" formula described in the assignment.
     * 
     * @param other other location to measure distance
     * @return the (spherical) distance in miles between this and other
     */

    public double distanceFrom(GeoLocation other) {

        // TODO: Implement this method

        double lat1 = Math.toRadians(this.latitude);
        double long1 = Math.toRadians(this.longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);



        ShortestDistance = (2 * RADIUS) * Math.asin(Math.sqrt(Math.pow(Math.sin((lat2-lat1)/2), 2)
                + Math.cos(lat1) * Math.cos(lat2) * (Math.pow(Math.sin((long2-long1)/2), 2) )));

        return ShortestDistance;
    }
}
