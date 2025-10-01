import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GeoLocationTest {

    @Test
    public void testDistance01() {
        double lat1 = 47.62145, long1 = -122.34828;
        double lat2 = 45.523307, long2 = -122.681423;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);

        assertEquals( 145.9907866, pt1.distanceFrom(pt2), 0.00001);
    }

    @Test
    public void testDistance02() {
        double lat1 = 47.62145, long1 = -122.34828;
        double lat2 = 40.773175, long2 = -73.97311;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);

        assertEquals( 2404.793482, pt1.distanceFrom(pt2), 0.00001);
    }

    @Test
    public void testDistance03() {
        double lat1 = 40.773175, long1 = -73.97311;
        double lat2 = 51.501402, long2 = -0.135099;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);

        assertEquals( 3460.90661, pt1.distanceFrom(pt2), 0.00001);
    }

    @Test
    public void testDistance04() {
        double lat1 = 47.62145, long1 = -122.34828;
        double lat2 = 19.826321, long2 = -155.467844;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);

        assertEquals( 2669.4427598, pt1.distanceFrom(pt2), 0.00001);
    }

    @Test
    public void testDistance05() {
        double lat1 = 47.146230, long1 = -122.43906847;
        double lat2 = 47.236669, long2 = -122.427021;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);

        assertEquals( 6.28127, pt1.distanceFrom(pt2), 0.00001);
    }

}
