import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointOfInterestTest {

    private PointOfInterest poi;
    @BeforeEach
    public void setup() {
        double lat1 = 47.62145, long1 = -122.34828;
        GeoLocation loc = new GeoLocation(lat1, long1);
        poi = new PointOfInterest("The name", "The address", "sushi, food, restaurant", loc);
    }

    @Test
    public void testMatch01() {
        assertTrue( poi.match("NAME") );
    }

    @Test
    public void testMatch02() {
        assertTrue( poi.match("the") );
    }

    @Test
    public void testMatch03() {
        assertTrue( poi.match("foOd") );
    }

    @Test
    public void testMatch04() {
        assertTrue( poi.match("food") );
    }

    @Test
    public void testMatch05() {
        assertFalse( poi.match("restaurants") );
    }
    @Test
    public void testMatch06() {
        assertTrue( poi.match("restaurant") );
    }
    @Test
    public void testMatch07() {
        assertFalse( poi.match("stuff") );
    }
    @Test
    public void testMatch08() {
        assertTrue( poi.match("SuShi") );
    }

    @Test
    public void testDistance01() {
        double lat1 = 47.62145, long1 = -122.34828;
        double lat2 = 45.523307, long2 = -122.681423;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);
        PointOfInterest p = new PointOfInterest("test", "test addr", "test tags", pt2);

        assertEquals( 145.9907866, p.distanceFrom(pt1), 0.00001);
    }

    @Test
    public void testDistance02() {
        double lat1 = 47.62145, long1 = -122.34828;
        double lat2 = 40.773175, long2 = -73.97311;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);
        PointOfInterest p = new PointOfInterest("test", "test addr", "test tags", pt2);

        assertEquals( 2404.793482, p.distanceFrom(pt1), 0.00001);
    }

    @Test
    public void testDistance03() {
        double lat1 = 40.773175, long1 = -73.97311;
        double lat2 = 51.501402, long2 = -0.135099;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);
        PointOfInterest p = new PointOfInterest("test", "test addr", "test tags", pt2);

        assertEquals( 3460.90661, p.distanceFrom(pt1), 0.00001);
    }

    @Test
    public void testDistance04() {
        double lat1 = 47.62145, long1 = -122.34828;
        double lat2 = 19.826321, long2 = -155.467844;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);
        PointOfInterest p = new PointOfInterest("test", "test addr", "test tags", pt2);

        assertEquals( 2669.4427598, p.distanceFrom(pt1), 0.00001);
    }

    @Test
    public void testDistance05() {
        double lat1 = 47.146230, long1 = -122.43906847;
        double lat2 = 47.236669, long2 = -122.427021;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);
        PointOfInterest p = new PointOfInterest("test", "test addr", "test tags", pt2);

        assertEquals( 6.28127, p.distanceFrom(pt1), 0.00001);
    }
}
