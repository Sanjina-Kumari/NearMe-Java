import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PoiListTest {
    private static PoiList db;
    private static GeoLocation source;

    @BeforeAll
    public static void setupClass() throws Exception {
        db = new PoiList("places.txt");
        source = new GeoLocation(47.145741, -122.446611);
    }

    @Test
    public void bestMatch01() {
        PointOfInterest poi = db.findNearestMatch(source, "Sushi");
        assertEquals("Umi Sake House", poi.getName());
        assertEquals("2230 1st Ave", poi.getAddress());
        assertEquals("restaurant, sushi", poi.getTags());
        assertEquals( 32.3558, poi.distanceFrom(source), 0.001 );
    }

    @Test
    public void bestMatch02() {
        PointOfInterest poi = db.findNearestMatch(source, "Cobb Salad");
        assertNull(poi);
    }

    @Test
    public void bestMatch03() {
        PointOfInterest poi = db.findNearestMatch(source, "Entertainment");
        assertEquals("Lagerquist Concert Hall", poi.getName());
        assertEquals("868 Wheeler St S", poi.getAddress());
        assertEquals("entertainment, tourism", poi.getTags());
        assertEquals( 0.075037, poi.distanceFrom(source), 0.001 );
    }

    @Test
    public void bestMatch04() {
        PointOfInterest poi = db.findNearestMatch(source, "GROCERY");
        assertEquals("Saar’s Market Place Foods", poi.getName());
        assertEquals("13322 Pacific Ave S. Tacoma, WA 98444", poi.getAddress());
        assertEquals("grocery, parkland, food", poi.getTags());
        assertEquals( 0.841726, poi.distanceFrom(source), 0.001 );
    }

    @Test
    public void bestMatch05() {
        PointOfInterest poi = db.findNearestMatch(source, "Saar");
        assertEquals("Saar’s Market Place Foods", poi.getName());
        assertEquals("13322 Pacific Ave S. Tacoma, WA 98444", poi.getAddress());
        assertEquals("grocery, parkland, food", poi.getTags());
        assertEquals( 0.841726, poi.distanceFrom(source), 0.001 );
    }
}
