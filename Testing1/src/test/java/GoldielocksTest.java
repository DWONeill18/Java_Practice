
import static org.junit.Assert.fail;

import org.junit.Test;

public class GoldielocksTest {
	
	@Test
	public void hot() {
		App app = new App();
		assertEquals("Too Hot error", "Too Hot", app.goldilocks(35));
	
	@Test
	public void cold() {
		App app = new App();
		assertEquals("Too Cold error", "Too Cold", app.goldilocks(3));		
	}
	
	@Test
	public void good() {
		App app = new App();
		assertEquals("Just right error", "Just right", app.goldilocks(20));		
	}
	
	}
	
}