import java.util.ArrayList;
import java.util.Collections;

public class HotelFloor {
    private final int numberOfMainCorridors;
    private final int numberOfSubCorridors;
    private ArrayList<Boolean> AC;
    private ArrayList<Boolean>mainCorridorsLight;
    private ArrayList<Boolean> subCorridorsLight;


    public HotelFloor( int numberOfMainCorridors, int numberOfSubCorridors) {
        this.numberOfMainCorridors = numberOfMainCorridors;
        this.numberOfSubCorridors = numberOfSubCorridors;
        AC = new ArrayList<Boolean>(numberOfMainCorridors+numberOfSubCorridors);
        Collections.fill(AC, Boolean.TRUE);
        subCorridorsLight = new ArrayList<>();
        for (int i = 0; i < numberOfSubCorridors; i++) subCorridorsLight.add(false);
        mainCorridorsLight=new ArrayList<>();
        for (int i = 0; i < numberOfMainCorridors; i++) mainCorridorsLight.add(true);
    }

    public boolean checkWhetherAcAreSwitchedOn() {
        return !(AC.contains(false));

    }


    public boolean checkWhetherSubCorridorsLightsAreOff() {
        return !subCorridorsLight.contains(true);
    }



    public boolean checkWhetherMainCorridorsLightsAreTurnedOn() {
        return !mainCorridorsLight.contains(false);
    }

    public void addMovement( int subCorridor) {
            subCorridorsLight.set(subCorridor-1, true);
    }

    public boolean isLightTurnedOn(int subCorridor) {

        return (subCorridorsLight.get(subCorridor-1));
    }
}


