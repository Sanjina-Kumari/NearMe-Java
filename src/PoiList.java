import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class PoiList {

    private ArrayList<PointOfInterest> points;

    public PoiList(String filePath) throws IOException {
        points = new ArrayList<>();

        Scanner fileScanner = new Scanner(new File(filePath));

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split("\\t");

            if (parts.length >= 5) { // To calculate all the parts like name, address, tags, latitude, longtude
                String name = parts[0];
                String address = parts[1];
                String tags = parts[2];

                double latitude = Double.parseDouble(parts[3]);
                double longitude = Double.parseDouble(parts[4]);

                GeoLocation location = new GeoLocation(latitude, longitude);
                PointOfInterest poi = new PointOfInterest(name, address, tags, location);

                points.add(poi);
            }
        }


        fileScanner.close();
    }



    public PointOfInterest findNearestMatch(GeoLocation location, String search) {
        PointOfInterest closestMatch = null;
        double shortestDistance = Double.MAX_VALUE;

        for (PointOfInterest poi : points) {
            if (poi.match(search)) {
                double distance = poi.distanceFrom(location);

                if (distance < shortestDistance) {
                    closestMatch = poi;
                    shortestDistance = distance;
                }
            }
        }

        return closestMatch;
    }

    public static void main(String[] args) {
        try {
            PoiList poiList = new PoiList("places.txt");
            GeoLocation testLocation = new GeoLocation(58.1399, -20.9000);
            PointOfInterest closestMatch = poiList.findNearestMatch(testLocation, "Space Needle");

            if (closestMatch != null) {
                System.out.println("Nearest Match: " + closestMatch.getName());
            } else {
                System.out.println("No match found.");
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}