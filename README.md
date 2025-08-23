# Lab 3 - Using Classes 2

## Space Exploration Tools

Create three classes `Planet`, `SpaceTools`, and `SpaceRunner` with the following starter code:

```Java
public class Planet {
    private String name;
    private double distanceFromSun; // in millions of km

    public Planet(String name, double distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    public String getName() { return name; }
    public double getDistanceFromSun() { return distanceFromSun; }
}
```

```Java
public class SpaceTools{


}
```

```Java
public class SpaceRunner {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 150); // 150 million km
        Planet mars = new Planet("Mars", 228);
        
        System.out.println("Travel time to Earth at 50,000 km/h: " + 
	        SpaceTools.travelTime(earth, 50_000) + " hours");
	        
		System.out.println("The closest planet is: " + 
			SpaceTools.compareDistance(earth, mars));
			
		System.out.println("The abbreviation for Mars is: " + 
			SpaceTools.abbreviation(Planet p));
			
        System.out.println("Earth orbit time (default speed): " +
            SpaceTools.orbitTime(earth) + " hours");
            
        System.out.println("Mars orbit time at 80,000 km/h: " +
            SpaceTools.orbitTime(mars, 80_000) + " hours");
    }
}
```


For this assignment, you will write 5 methods in the `SpaceTools` class as described below. Think carefully about the method headers for each as you write them. You do not need to include an additional main. `SpaceTools` should function appropriately when running the `SpaceRunner` main as is. 

- Create a method `travelTime(Planet p, double speed)` that returns the travel time in hours. Assume the speed is given in km/h
- Create a method `compareDistance(Planet a, Planet b)` that returns the planet which is closer
- Create a method `abbreviation(Planet p)` that returns the first three letters of the name in upper case
- Create 2 methods `orbitTime(Planet p)` and `orbitTime(Planet p, double speed)` which return the orbit time for the planet around the sun, assuming a circular orbit. For the first method, assume a default speed of 100,000 km/h. 
- **Optional Extension:** create the static method `randomDestination(Planet[] planets)` which returns a random planet from the array.
