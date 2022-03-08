import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HotelAutomationTest {
    @Test
    void shouldCheckWhetherAllTheACsAreSwitchedOn() {
        Hotel hotel = new Hotel(2, 1, 2);

        assertThat(hotel.checkWhetherAcAreSwitchedOn(),is(true));
    }

    @Test
    void shouldCheckWhetherSubCorridorsLightsAreTurnedOffInitially() {
        Hotel hotel = new Hotel(2, 1, 3);

        assertThat(hotel.checkWhetherSubCorridorsLightsAreOff(),is(true));
    }

    @Test
    void shouldCheckWhetherMainCorridorsLightsAreTurnedOn() {
        Hotel hotel = new Hotel(2, 1, 2);

        assertThat(hotel.checkWhetherMainCorridorsLightsAreTurnedOn(),is(true));
    }
}
