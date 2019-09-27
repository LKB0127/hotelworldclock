package hotelworldclock;

public class main {
	 public static void main(String[] args) {
	        // Attach 5 cities to TimeSubject class
	        TimeSubject.attach("Beijing", new Beijing());
	        TimeSubject.attach("London", new London());
	        TimeSubject.attach("Moscow", new Moscow());
	        TimeSubject.attach("Sydney", new Sydney());
	        TimeSubject.attach("NewYork", new NewYork());

	        // Adjust the time of Beijing clock to be 9
	        TimeSubject.getCityClock("Beijing").setUtcZeroTime(9);

	        // Display the time of the 5 cities
	        System.out.println("The time of Beijing is " + TimeSubject.getCityClock("Beijing").getCityTime());
	        System.out.println("The time of London is " + TimeSubject.getCityClock("London").getCityTime());
	        System.out.println("The time of Moscow is " + TimeSubject.getCityClock("Moscow").getCityTime());
	        System.out.println("The time of Sydney is " + TimeSubject.getCityClock("Sydney").getCityTime());
	        System.out.println("The time of New York is " + TimeSubject.getCityClock("NewYork").getCityTime());
	    }
}
