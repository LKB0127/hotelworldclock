package hotelworldclock;

public class London extends CityClock {
    private static final int UTC_OFFSET = 0;

    @Override
    protected int convertCityTimeToUtcZeroTime(int cityTime) {
        return keepInRange0To24(cityTime - UTC_OFFSET);
    }

    @Override
    public void updateCityTime(int utcZeroTime) {
        cityTime = keepInRange0To24(utcZeroTime + UTC_OFFSET);
    }
}