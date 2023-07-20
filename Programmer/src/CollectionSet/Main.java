package CollectionSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// programul va folosi o harta pentru a stoca toate obiectele corpului ceresc
// cu set se grupeaza obiecte in diferite tipuri
public class Main {
    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Mars",687);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Earth").addMoon(tempMoon); // Adaugă satelitul "Moon" la planeta "Earth

//

        tempMoon = new HeavenlyBody("Demios", 30);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Mars").addMoon(tempMoon);

        System.out.println("Planets");
        for(HeavenlyBody planet : planets)
        {
            System.out.println("\t"+planet.getName());
        }


        System.out.println("Planets and their Satellites:");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
            Set<HeavenlyBody> moons = planet.getSatellites();

            // Verificăm dacă setul de sateliți este gol
            if (moons.isEmpty()) {
                System.out.println("\t\tThis planet has no satellites.");
            } else {
                for (HeavenlyBody moon : moons) {
                    System.out.println("\t\t" + moon.getName());
                }
            }
        }

    }
}
