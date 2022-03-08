import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HotelAutomationTest {
    @Test
    void shouldCheckWhetherAllTheACsAreSwitchedOn() {
        HotelFloor hotelFloor = new HotelFloor( 1, 2);

        assertThat(hotelFloor.checkWhetherAcAreSwitchedOn(),is(true));
    }

    @Test
    void shouldCheckWhetherSubCorridorsLightsAreTurnedOffInitially() {
        HotelFloor hotelFloor = new HotelFloor(1, 3);

        assertThat(hotelFloor.checkWhetherSubCorridorsLightsAreOff(),is(true));
    }

    @Test
    void shouldCheckWhetherMainCorridorsLightsAreTurnedOn() {
        HotelFloor hotelFloor = new HotelFloor( 1, 2);

        assertThat(hotelFloor.checkWhetherMainCorridorsLightsAreTurnedOn(),is(true));
    }

    @Test
    void shouldTurnOnTheFirstSubCorridorLightWhenThereIsAMovement() {
        HotelFloor hotelFloor = new HotelFloor( 1, 2);

        hotelFloor.addMovement(2);

        assertThat(hotelFloor.isLightTurnedOn(2),is(true));

    }
}
