# NearMe-Java
Ever wondered how Google Maps knows the closest sushi spot or concert hall?   **NearMe-Java** is a Java console application that finds the nearest **Point of Interest (POI)** to a user’s location.   It’s a mini-maps engine built completely from scratch using the Haversine formula.

## Project Overview
NearMe-Java is a lightweight location finder that:
- Takes user input for latitude/longitude (or defaults to PLU campus).  
- Accepts a search term (e.g., "sushi", "entertainment").  
- Searches through a dataset of points of interest.  
- Returns the **closest match** along Earth’s surface using geospatial math.  
- Handles cases like **no matches found** with clear output.  

Think of it as a **mini clone of Google Maps search**, but coded in Java.

---

##  Features
- 🌍 **Distance Accuracy** – Uses the Haversine formula to measure spherical distances.  
- 🔎 **Search & Match** – Matches terms against POI names and tags (case-insensitive).  
- 🗂 **Clean OOP Design** – Built with modular classes:
  - `GeoLocation` → stores coordinates + calculates distances.  
  - `PointOfInterest` → represents each location.  
  - `PoiList` → loads data and finds nearest matches.  
  - `PoiFinder` → main program and user interaction.  
- ✅ **JUnit Testing** – Ensures methods work correctly with real test data.  
- ➕ **Extension** (bonus): Search within a radius to get **multiple nearby matches**.


## 🔧 Tech Stack
- **Java 21**  
- **JUnit 5** (unit testing)  
- **IntelliJ IDEA CE** (development environment)  

---

## App Overview

![Program Output](https://github.com/Sanjina-Kumari/NearMe-Java/blob/main/Output)

---

## Project Learning
- Implemented real-world **geospatial math** in Java.  
- Practiced **object-oriented programming** and UML design.  
- Built and debugged a full program in **IntelliJ IDEA**.  
- Gained hands-on experience with **JUnit testing**.  

---


---

## 📜 Acknowledgements
Project inspired by coursework in **CSCI 270 at Pacific Lutheran University**.  
Starter dataset and UML guidance provided by faculty.  

---
