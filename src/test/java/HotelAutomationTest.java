import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HotelAutomationTest {
    @Test
    void shouldCheckWhetherAllTheACsAreSwitchedOn() {

        Hotel hotel = new Hotel(2);
        hotel.Hotel[0] = new HotelFloor(1, 2);
        hotel.Hotel[1] = new HotelFloor(1, 2);

        assertThat(hotel.Hotel[0].checkWhetherAcAreSwitchedOn(), is(true));
        assertThat(hotel.Hotel[1].checkWhetherAcAreSwitchedOn(), is(true));


    }

    @Test
    void shouldCheckWhetherSubCorridorsLightsAreTurnedOffInitially() {
        Hotel hotel = new Hotel(2);
        hotel.Hotel[0] = new HotelFloor(1, 2);
        hotel.Hotel[1] = new HotelFloor(1, 2);

        assertThat(hotel.Hotel[1].checkWhetherSubCorridorsLightsAreOff(), is(true));
        assertThat(hotel.Hotel[0].checkWhetherSubCorridorsLightsAreOff(),is(true));
    }

    @Test
    void shouldCheckWhetherMainCorridorsLightsAreTurnedOnInSecondFloor() {
        Hotel hotel = new Hotel(2);
        hotel.Hotel[0] = new HotelFloor(1, 2);
        hotel.Hotel[1] = new HotelFloor(1, 2);

        assertThat(hotel.Hotel[1].checkWhetherMainCorridorsLightsAreTurnedOn(), is(true));
    }

    @Test
    void shouldTurnOnTheFirstSubCorridorLightWhenThereIsAMovementInFirstFloor() {
        Hotel hotel = new Hotel(2);
        hotel.Hotel[0] = new HotelFloor(1, 2);
        hotel.Hotel[1] = new HotelFloor(1, 2);

        hotel.Hotel[0].movementDetected(1);

        hotel.Hotel[0].normalizeElectricityConsumption(1);

        assertThat(hotel.Hotel[0].isLightTurnedOn(1), is(true));

    }

    @Test
    void shouldNotTurnOnTheSecondSubCorridorLightWhenThereIsNoMovementInSecondFloor() {
        Hotel hotel = new Hotel(2);
        hotel.Hotel[0] = new HotelFloor(1, 2);
        hotel.Hotel[1] = new HotelFloor(1, 2);

        assertThat(hotel.Hotel[1].isLightTurnedOn(2), is(false));

    }
}
