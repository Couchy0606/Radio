import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.maven.Radio;

public class RadioTest {

    @Test
    public void shouldCountStation() {
        Radio stat = new Radio(10);

        stat.setCurrentStation(6);

        int expected = 6;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(8);

        int expected = 8;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAbove() {
        Radio stat = new Radio();

        stat.setCurrentStation(10);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelow() {
        Radio stat = new Radio();

        stat.setCurrentStation(-1);

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(8);

        stat.next();

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseStationIfMax() {
        Radio stat = new Radio();

        stat.setCurrentStation(9);

        stat.next();

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(1);

        stat.prev();

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseStationIfMin() {
        Radio stat = new Radio();

        stat.setCurrentStation(0);

        stat.prev();

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetVolume() {
        Radio vol = new Radio();

        vol.currentVolume(100);

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio vol = new Radio();

        vol.currentVolume(200);


        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio vol = new Radio();

        vol.currentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeByOne() {
        Radio vol = new Radio();
        vol.currentVolume(2);

        vol.increaseVolume();

        int expected = 3;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMaxStation() {
        Radio stat = new Radio();

        stat.setMaxStation();

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio stat = new Radio();

        stat.setMinStation();

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


}