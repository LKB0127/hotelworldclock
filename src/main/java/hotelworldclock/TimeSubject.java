package hotelworldclock;
import java.util.HashMap;

public abstract class TimeSubject {
    protected static HashMap<String, CityClock> cityClocks = new HashMap<String, CityClock>();

    public static void attach(String cityName, CityClock cityClock) {
        cityClocks.put(cityName, cityClock);
    }

    public static void detach(String cityName) {
        cityClocks.remove(cityName);
    }

    public abstract void notifyAllCityClocks();

    public static CityClock getCityClock(String cityName) {
        if (cityClocks.keySet().contains(cityName)) {
            return cityClocks.get(cityName);
        }
        throw new IllegalStateException("The city name " + cityName + " does not exist.");

    }
}