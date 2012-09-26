import static org.junit.Assert.*;

import org.junit.Test;


public class MineTest {

	@Test
	public void testToString() {
		String mine = "######\n#. *R#\n#  x.#\n#x * #\nL  .x#\n######";

		Mine m = new Mine(mine);
		assertEquals(m.toString(), mine);
	}

	@Test
	public void testGetCell() {
		String mine = "######\n#. *R#\n#  x.#\n#x * #\nL  .x#\n######";

		Mine m = new Mine(mine);
		
		assertEquals(m.getCell(0,0), '#');
		assertEquals(m.getCell(1,1), '.');
		assertEquals(m.getCell(1,3), '*');
		assertEquals(m.getCell(1,4), 'R');
		assertEquals(m.getCell(4,0), 'L');
	}

	@Test
	public void testSetCell() {
		String mine = "######\n#. *R#\n#  x.#\n#x * #\nL  .x#\n######";

		Mine m = new Mine(mine);
		
		assertEquals(m.getCell(0,0), '#');
		m.setCell(0, 0, ' ');
		assertEquals(m.getCell(0,0), ' ');
	}

	@Test
	public void testMove() {
		String mine = "######\n#. *R#\n#  x.#\n#x * #\nL  .x#\n######";

		Mine m = new Mine(mine);
		
	
		
		
	}

	@Test
	public void testUpdateMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testLevelUp() {
		fail("Not yet implemented");
	}

}