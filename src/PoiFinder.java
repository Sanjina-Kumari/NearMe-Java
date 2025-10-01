import java.io.IOException;
import java.util.Scanner;

public class PoiFinder {

    public static void main(String[] args) {
        try {
            PoiList poilist = new PoiList("places.txt");
            interact(poilist);
        } catch (IOException e) {
            System.out.println("Error in reading the file: " + e.getMessage());
        }
    }

    public static void interact(PoiList poiList) {
        Scanner scnr = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to poi finder");
            System.out.print("Location [latitude, longitude], or empty for PLU campus: ");
            String locationInput = scnr.nextLine();

            double latitude, longitude;

            if (locationInput.isEmpty()) {
                latitude = 47.145689;
                longitude = -122.446654;
            } else {
                String[] parts = locationInput.split(",");
                latitude = Double.parseDouble(parts[0]);
                longitude = Double.parseDouble(parts[1]);
            }

            System.out.print("Search term(s): ");
            String searchTerm = scnr.nextLine();

            PointOfInterest nearestmatch = poiList.findNearestMatch(new GeoLocation(latitude, longitude), searchTerm);

            if (nearestmatch != null) {
                System.out.println("Nearest match to [" + latitude + ", " + longitude + "]:");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println();
                System.out.println("Name: " + nearestmatch.getName());
                System.out.println("Address: " + nearestmatch.getAddress());
                System.out.println("Tags: " + nearestmatch.getTags());
                System.out.printf("Distance: %.4f miles\n", nearestmatch.distanceFrom(new GeoLocation(latitude, longitude)));
            } else {
                System.out.println("Sorry, no match found");
            }

            scnr.close();
        }
    }
}

