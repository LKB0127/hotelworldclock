package hotelworldclock;
import java.util.Iterator;

public class UTCTime extends TimeSubject {
    private int utcZeroTime;

    @Override
    public void notifyAllCityClocks() {
        Iterator<CityClock> cityClockIterator = cityClocks.values().iterator();
        while (cityClockIterator.hasNext()) {
            CityClock cityClock = cityClockIterator.next();
            cityClock.updateCityTime(utcZeroTime);
        }
    }

    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
        notifyAllCityClocks();
    }

}
