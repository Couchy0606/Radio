import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.maven.Radio;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(6);

        int expected = 6;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(10);

        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio stat = new Radio();

        stat.setCurrentStation(10);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio vol = new Radio();

        vol.setCurrentVolume(11);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio stat = new Radio();

        stat.setCurrentStation(-1);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio vol = new Radio();

        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio stat = new Radio();

        stat.setMaxStation();

        int expected = 9;
        int actual = stat.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio stat = new Radio();

        stat.setMinStation();

        int expected = 0;
        int actual = stat.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio vol = new Radio();

        vol.setMaxVolume();

        int expected = 10;
        int actual = vol.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio vol = new Radio();

        vol.setMinVolume();

        int expected = 0;
        int actual = vol.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationByOne() {
        Radio stat = new Radio();
        stat.setCurrentStation(0);

        stat.increaseStation();

        int expected = 1;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOne() {
        Radio vol = new Radio();
        vol.setCurrentVolume(2);

        vol.increaseVolume();

        int expected = 3;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


