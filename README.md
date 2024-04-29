Sortieren von Motorrädern
======

## Beschreibung

Dieses Java-Programm bietet Sortiervorgänge mit den Schnittstellen Comperator und Comperable.

## Installation (Intellij IDE)

`src`-Ordner im **neuen** Java projekt kopieren.  

## Usage

```java
// Comperable Interface (Construction Year)

@Override
    public int compareTo(Bike otherBike) { return Integer.compare(getConstructionYear(), otherBike.getConstructionYear());}
/// Comperator Inteface(Horsepower, Color, BikeType, Brand)
@Override
import java.util.Comparator;
    public int compare(Bike o1, Bike o2) { return o1.getColor().compareTo(o2.getColor());}
    public int compare(Bike o1, Bike o2) { return o1.getType().compareTo(o2.getType());}
    public int compare(Bike o1, Bike o2) {return o1.getBrand().compareTo(o2.getBrand());}
    public int compare(Bike o1, Bike o2) {return Integer.compare(o2.getHorsePower(),o1.getHorsePower());}
```

# Contact

Für Anregungen, Verbesserungen und Fragen können Sie mich gerne per E-Mail kontaktieren.
<person123@gmail.com>

* [Exercise1](exercise1.md)
