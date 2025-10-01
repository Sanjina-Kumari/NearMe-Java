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

```bash
git clone https://github.com/Sanjina-Kumari/NearMe-Java.git
Open the project in IntelliJ IDEA (or any Java IDE).

Compile the project (if needed):

bash
Copy code
javac src/*.java
Run the main program:

bash
Copy code
java src/PoiFinder
Follow the prompts:

Enter your location (latitude,longitude) or press Enter to use the default PLU campus.

Enter a search term (e.g., "sushi", "entertainment").

View the closest match (or matches if using the radius extension).

Rules for POI Search
Matches are case-insensitive.

Search matches name or tags of the POI.

If multiple matches exist, the program returns the closest match.

If no match is found, an appropriate message is displayed.

File Structure
bash
Copy code
NearMe-Java/
├── src/
│   ├── GeoLocation.java        # Coordinates and distance calculation
│   ├── PointOfInterest.java    # Represents each POI
│   ├── PoiList.java            # Loads data and finds nearest matches
│   └── PoiFinder.java          # Main program and user interaction
├── Output/                     # Screenshots or sample outputs
├── places.txt                  # Dataset of points of interest
└── README.md                   # This file
Example Usage
yaml
Copy code
Location [latitude,longitude], or empty for PLU campus: 47.609567,-122.34185
Search term(s): Sushi

Nearest match to [47.6096, -122.3419]
----------------------------------------
Name:     Japonessa Sushi
Address:  1400 1st Ave, Seattle
Tags:     restaurant, sushi, japanese
Distance: 0.1688 miles
<!-- Replace with your screenshot -->

Troubleshooting
No POIs Found: Ensure places.txt is in the same directory and search terms are valid.

Compilation Errors: Make sure all .java files are in src/ and JDK 21 is installed.

Screenshot Not Displayed: Confirm Output/output.png exists and the path is correct.

Customization
Update POIs: Replace contents of places.txt with your own dataset.

Modify Search: Add more tags or POI attributes in PointOfInterest.java.

Author
Developed by Sanjina Kumari at Pacific Lutheran University.
For questions or feedback, feel free to reach out!

pgsql
Copy code

---

✅ This version is **fully GitHub-friendly**:  
- Proper headings (`#`, `##`)  
- Code blocks wrapped in triple backticks  
- No broken spacing or markdown issues  
- You can copy-paste directly into `README.md`  

If you want, I can also make a **slightly more interactive version with a table of contents and links to sections** like professional repos have.  

Do you want me to do that next?






You said:
know all this info is going in github readme, give me all in mardown


ChatGPT said:
Perfect! Here’s the entire README in proper GitHub markdown, ready to copy-paste into your README.md. I’ve formatted everything — headings, code blocks, file structure, screenshots, lists — so it works perfectly on GitHub.

markdown
Copy code
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

```bash
git clone https://github.com/Sanjina-Kumari/NearMe-Java.git
Open the project in IntelliJ IDEA (or any Java IDE).

Compile the project (if needed):

bash
Copy code
javac src/*.java
Run the main program:

bash
Copy code
java src/PoiFinder
Follow the prompts:

Enter your location (latitude,longitude) or press Enter to use the default PLU campus.

Enter a search term (e.g., "sushi", "entertainment").

View the closest match (or matches if using the radius extension).

Rules for POI Search
Matches are case-insensitive.

Search matches name or tags of the POI.

If multiple matches exist, the program returns the closest match.

If no match is found, an appropriate message is displayed.

File Structure
bash
Copy code
NearMe-Java/
├── src/
│   ├── GeoLocation.java        # Coordinates and distance calculation
│   ├── PointOfInterest.java    # Represents each POI
│   ├── PoiList.java            # Loads data and finds nearest matches
│   └── PoiFinder.java          # Main program and user interaction
├── Output/                     # Screenshots or sample outputs
├── places.txt                  # Dataset of points of interest
└── README.md                   # This file
Example Usage
yaml
Copy code
Location [latitude,longitude], or empty for PLU campus: 47.609567,-122.34185
Search term(s): Sushi

Nearest match to [47.6096, -122.3419]
----------------------------------------
Name:     Japonessa Sushi
Address:  1400 1st Ave, Seattle
Tags:     restaurant, sushi, japanese
Distance: 0.1688 miles
<!-- Replace with your screenshot -->

Troubleshooting
No POIs Found: Ensure places.txt is in the same directory and search terms are valid.

Compilation Errors: Make sure all .java files are in src/ and JDK 21 is installed.

Screenshot Not Displayed: Confirm Output/output.png exists and the path is correct.

Customization
Update POIs: Replace contents of places.txt with your own dataset.

Modify Search: Add more tags or POI attributes in PointOfInterest.java.

Author
Developed by Sanjina Kumari at Pacific Lutheran University.
For questions or feedback, feel free to reach out!
