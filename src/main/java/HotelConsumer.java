import java.util.Scanner;

public class HotelConsumer {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of floors");
        int numberOfFloors=sc.nextInt();
        System.out.println("Enter the number of main corridors");
        int numberOfMainCorridors=sc.nextInt();
        System.out.println("Enter the number of Sub corridors");
        int numberOfSubCorridors=sc.nextInt();
        Hotel hotel =new Hotel(numberOfFloors);
        for(int i=0;i<numberOfFloors;i++)
            hotel.Hotel[i]=new HotelFloor(numberOfMainCorridors,numberOfSubCorridors);
        currentStateOfAppliances(hotel,numberOfFloors);

        hotel.Hotel[0].movementDetected(1);

        hotel.Hotel[0].normalizeElectricityConsumption(1);

        currentStateOfAppliances(hotel,numberOfFloors);

    }

    public static void currentStateOfAppliances(Hotel hotel,int numberOfFloors) {

        for (int k = 0; k < numberOfFloors; k++) {

            System.out.println("Floor : "+(k+1));

            for (int i = 0; i < hotel.Hotel[k].numberOfMainCorridors; i++) {
                System.out.print("Main Corridor " + (i + 1));
                System.out.print(" AC  " + (i + 1) + " : ");
                boolean AcIsOnOrOff = hotel.Hotel[k].mainCorridorAC.get(i);
                if (AcIsOnOrOff) {
                    System.out.print("On, ");
                }
                else System.out.print("Off, ");

                boolean LightIsOnOrOFF = hotel.Hotel[k].mainCorridorsLight.get(i);
                System.out.print("Light  " + (i + 1) + " : ");
                if (LightIsOnOrOFF) {
                    System.out.print("On, ");
                }
                else System.out.print("Off, ");

            }

            for (int i = 0; i < hotel.Hotel[k].numberOfSubCorridors; i++) {
                System.out.print("Sub-Corridor " + (i + 1));
                System.out.print(" AC  " + (i + 1) + " : ");
                boolean AcIsOnOrOff = hotel.Hotel[k].subCorridorAC.get(i);
                if (AcIsOnOrOff) {
                    System.out.print("On, ");
                }
                    else System.out.print("Off, ");

                boolean LightIsOnOrOFF = hotel.Hotel[k].subCorridorsLight.get(i);
                System.out.print("Light  " + (i + 1) + " : ");
                if (LightIsOnOrOFF) {
                    System.out.print("On, ");
                }
                else System.out.print("Off, ");

            }
            System.out.println();
        }
    }
}
