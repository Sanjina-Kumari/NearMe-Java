# NearMe-Java

NearMe-Java is a Java console application that helps users find the **nearest Point of Interest (POI)** from a given location. Users can input latitude and longitude (or use the default PLU campus location) and search for locations like restaurants, entertainment venues, or any POI. The program uses the **Haversine formula** to calculate distances along the Earth's surface.

---

## Features

- Console-based user interface for easy interaction.  
- Accepts a search term and finds the **closest matching POI**.  
- Handles cases when no matches are found.  
- Implements real-world **geospatial math** with the Haversine formula.  
- Modular **object-oriented design** with classes:
  - `GeoLocation` → stores coordinates and calculates distances.  
  - `PointOfInterest` → represents a location with name, address, and tags.  
  - `PoiList` → loads POIs and finds nearest matches.  
  - `PoiFinder` → main program with user interaction.  
- **JUnit testing** ensures correctness of methods.  
- Optional extension: search within a radius to find **multiple nearby POIs**.

---

## How to Run

### Prerequisites

- Java Development Kit (JDK 21) installed.  
- IDE or editor such as **IntelliJ IDEA CE**.  
- `places.txt` dataset file (included in repo).  

### Steps

  1. Clone the project:


  git clone https://github.com/Sanjina-Kumari/NearMe-Java.git
  2. Open the project in IntelliJ IDEA (or any Java IDE).

  3. Compile the project (if needed):
  javac src/*.java

  4. Run the main program:
  java src/PoiFinder

  5. Follow the prompts:
  Enter your location (latitude,longitude) or press Enter to use the default PLU campus.
  Enter a search term (e.g., "sushi", "entertainment").
  View the closest match (or matches if using the radius extension).

## Rules for POI Search
 - Matches are case-insensitive.
 - Search matches name or tags of the POI.
 - If multiple matches exist, the program returns the closest match.
 - If no match is found, an appropriate message is displayed.

## File Structure

 
  
## Example Usage



## Troubleshooting
  - No POIs Found: Ensure places.txt is in the same directory and search terms are valid.
  - Compilation Errors: Make sure all .java files are in src/ and JDK 21 is installed.


## Customization
 Update POIs: Replace contents of places.txt with your own dataset.
 Modify Search: Add more tags or POI attributes in PointOfInterest.java.

## Developer
  Developed by Sanjina Kumari at Pacific Lutheran University.
 
  For questions or feedback, feel free to reach out at sanjinamandhwani1@gmail.com!

## 📜 Acknowledgements
Project inspired by coursework in **CSCI 270 at Pacific Lutheran University**.  

Starter dataset and UML guidance provided by faculty.  


