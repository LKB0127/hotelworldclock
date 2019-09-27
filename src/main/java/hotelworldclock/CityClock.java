package hotelworldclock;

public abstract class CityClock {
    protected int cityTime;
    protected UTCTime utcTime = new UTCTime();

    public void setUtcZeroTime(int cityTime) {
        utcTime.setUtcZeroTime(convertCityTimeToUtcZeroTime(cityTime));
    }

    protected abstract int convertCityTimeToUtcZeroTime(int cityTime);

    public abstract void updateCityTime(int utcZeroTime);

    public int getCityTime() {
        return cityTime;
    }

    protected int keepInRange0To24(int hour) {
        if (hour < 0) {
            return hour + 24;
        }
        if (hour > 24) {
            return hour - 24;
        }
        return hour;
    }
}