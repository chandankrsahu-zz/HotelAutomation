public class HotelConsumer {
    public static void main(String[] args) {


        HotelFloor firstFloor = new HotelFloor(1, 2);
        HotelFloor secondFloor = new HotelFloor(1, 2);

        System.out.println("Initial State");

        for(int k=0;k<2;k++)
        {
            System.out.println(" Floor: " +(k+1));
            for (int i = 0; i < firstFloor.numberOfMainCorridors; i++) {
                System.out.print("Main Corridor " + (i + 1));
                System.out.print(" AC  " + (i + 1) + " : ");
                boolean AcIsOnOrOff = firstFloor.mainCorridorAC.get(i);
                if (AcIsOnOrOff)
                    System.out.print("On ");
                else System.out.print("Off");

                boolean LightIsOnOrOFF = firstFloor.mainCorridorsLight.get(i);
                System.out.print("Light  " + (i + 1) + " : ");
                if (LightIsOnOrOFF)
                    System.out.print("On ");
                else System.out.print("Off");

            }

            for (int i = 0; i < firstFloor.numberOfSubCorridors; i++) {
                System.out.print("Sub-Corridor " + (i + 1));
                System.out.print(" AC  " + (i + 1) + " : ");
                boolean AcIsOnOrOff = firstFloor.subCorridorAC.get(i);
                if (AcIsOnOrOff)
                    System.out.print("On ");
                else System.out.print("Off");

                boolean LightIsOnOrOFF = firstFloor.subCorridorsLight.get(i);
                System.out.print("Light  " + (i + 1) + " : ");
                if (LightIsOnOrOFF)
                    System.out.print("On ");
                else System.out.print("Off");

            }
        }


    }
}
