import java.util.ArrayList;
import java.util.Collections;

public class Hotel {
    private final int numberOfFloors;
    private final int numberOfMainCorridors;
    private final int numberOfSubCorridors;
    private ArrayList<Boolean> AC;
    private ArrayList<Boolean> subCorridorsLight;

    public Hotel(int numberOfFloors, int numberOfMainCorridors, int numberOfSubCorridors) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfMainCorridors = numberOfMainCorridors;
        this.numberOfSubCorridors = numberOfSubCorridors;
        AC = new ArrayList<Boolean>(getNumberOfAppliances(numberOfFloors, numberOfMainCorridors, numberOfSubCorridors));
        Collections.fill(AC, Boolean.TRUE);
        subCorridorsLight=new ArrayList<>(getNumberOfAppliancesInSubCorridors(numberOfFloors, numberOfSubCorridors))  ;
        Collections.fill(subCorridorsLight,Boolean.FALSE);
    }




    public boolean checkWhetherAcAreSwitchedOn() {
        return !(AC.contains(false));

    }


    public boolean checkWhetherSubCorridorsLightsAreOff() {
        return ! subCorridorsLight.contains(true);
    }
    private int getNumberOfAppliancesInSubCorridors(int numberOfFloors, int numberOfSubCorridors) {
        return numberOfFloors * numberOfSubCorridors;
    }
    private int getNumberOfAppliances(int numberOfFloors, int numberOfMainCorridors, int numberOfSubCorridors) {
        return numberOfFloors * (numberOfMainCorridors + numberOfSubCorridors);
    }
}
