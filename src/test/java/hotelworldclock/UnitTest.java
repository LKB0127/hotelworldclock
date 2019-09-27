package hotelworldclock;
import static org.junit.Assert.*;
import org.junit.Test;
public class UnitTest {
	
	@Test
	public void testBeijing(){
		TimeSubject.attach("Beijing", new Beijing());
		TimeSubject.getCityClock("Beijing").setUtcZeroTime(9);
		assertEquals(9,TimeSubject.getCityClock("Beijing").getCityTime());
	}
	@Test
	public void testLondon(){
		TimeSubject.attach("London", new London());
		TimeSubject.getCityClock("Beijing").setUtcZeroTime(9);
		assertEquals(1,TimeSubject.getCityClock("London").getCityTime());
	}
	@Test
	public void testMoscow(){
		TimeSubject.attach("Moscow", new Moscow());
		TimeSubject.getCityClock("Beijing").setUtcZeroTime(9);
		assertEquals(5,TimeSubject.getCityClock("Moscow").getCityTime());
	}
	@Test
	public void testNewYork(){
		TimeSubject.attach("NewYork", new NewYork());
		TimeSubject.getCityClock("Beijing").setUtcZeroTime(9);
		assertEquals(20,TimeSubject.getCityClock("NewYork").getCityTime());
	}
	@Test
	public void testSydney(){
		TimeSubject.attach("Sydney", new Sydney());
		TimeSubject.getCityClock("Beijing").setUtcZeroTime(9);
		assertEquals(11,TimeSubject.getCityClock("Sydney").getCityTime());
	}
}
