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

Für Anregungen, Verbesserungen und Fragen können Sie mich gerne per E-Mail kontaktieren.<br>
<https://github.com/VinceChiv> under <https://www.fh-joanneum.at/>

1. [Exercise 1](exercise1.md)
   * Learning markdown and how to write markdown files.
2. [Exercise 2](exercise2.md)
   * Learning how to use git. How to set up a repository and use git commands.
3. [Exercise 3](exercise3.md)
   * Installing JDK-21 and Maven Apache. Creating calculator program. 
4. [Exercise 4](exercise4.md)
   * JUnit Testing
5. [Exercise 5](exercise5.md)
   * Git Branching and Logging
6. [Exercise 6](exercise6.md)
   * Documentation exercise using javadoc