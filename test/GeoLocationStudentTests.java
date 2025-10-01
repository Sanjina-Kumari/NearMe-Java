import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GeoLocationStudentTests {

    @Test
    public void testDistance01() throws Exception {
        double lat1 = 47.62145, long1 = -122.34828;
        double lat2 = 45.523307, long2 = -122.681423;

        GeoLocation pt1 = new GeoLocation(lat1, long1);
        GeoLocation pt2 = new GeoLocation(lat2, long2);

        assertEquals( 145.9907866, pt1.distanceFrom(pt2), 0.00001);
    }

    //
    // Add your tests here...
    //

}
