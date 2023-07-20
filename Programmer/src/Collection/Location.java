package Collection;

import jdk.internal.access.JavaSecurityAccess;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        // in loc sa fac asta in main de fiecare data o fac aici si atunci programul stie ca de fiecare data exista posibilitatea de Q adaugata direct
        this.exits.put("Q",0);
    }
    public void addExit(String direction, int location)
    {

        exits.put(direction,location);
    }
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        //the reason that we're doing that is that instead of just returning the exits map i'am creating a new hash map and passing out exits in the constructor
        //nimic din afara clasei nu poate schimba iesirile, astfel daca programul care apeleaza doreste da adauge sau sa elimine din acesata copie , campul nu va fi afectat
        return new HashMap<String,Integer>(exits);
    }
}
