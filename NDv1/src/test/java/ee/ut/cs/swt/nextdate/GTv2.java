package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNDv218() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1844, 1844, 1844);
	    String string0 = nDv2_0.run(10, 10, 1844);
	    assertEquals("10/11/1844", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv219() throws Throwable {
	    NDv21 nDv2_0 = new NDv21((-1571), (-1571), (-1571));
	    String string0 = nDv2_0.run(9, 9, 1813);
	    assertEquals("9/10/1813", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv216() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(5, 5, 5);
	    String string0 = nDv2_0.run(5, 5, 1801);
	    assertEquals("5/6/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv217() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1825, 1825, 1825);
	    String string0 = nDv2_0.run(8, 8, 1825);
	    assertEquals("8/9/1825", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv214() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1825, 1825, 1825);
	    String string0 = nDv2_0.run(2, 30, 1825);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv215() throws Throwable {
	    NDv21 nDv2_0 = new NDv21((-1308), (-1308), (-1308));
	    String string0 = nDv2_0.run(2, 29, 1804);
	    assertEquals("3/1/1804", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv212() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(2, 2, 2);
	    String string0 = nDv2_0.run(2, 28, 1801);
	    assertEquals("3/1/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv213() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(2, 2, 2);
	    String string0 = nDv2_0.run(2, 28, 1816);
	    assertEquals("2/29/1816", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv210() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(7, 7, 7);
	    String string0 = nDv2_0.run(7, 7, 1801);
	    assertEquals("7/7/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv211() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1825, 1825, 1825);
	    String string0 = nDv2_0.run(2, 2, 1825);
	    assertEquals("2/3/1825", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive1() throws Throwable {
	    NDv21 nDv2_0 = new NDv21((-1308), (-1308), (-1308));
	    String string0 = nDv2_0.run(2, 2, (-1308));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv29() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1836, 1836, 1836);
	    String string0 = nDv2_0.run(12, 31, 1836);
	    assertEquals("1/1/1837", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive0() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1836, 1836, 1358);
	    String string0 = nDv2_0.run((-1), 228, 1358);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv27() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1830, 1830, 1830);
	    String string0 = nDv2_0.run(12, 30, 1830);
	    assertEquals("12/31/1830", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv28() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1836, 1836, 1358);
	    String string0 = nDv2_0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1836, 1836, 1836);
	    String string0 = nDv2_0.run(1836, 12, 31);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithNegativeAndRunWithNegative() throws Throwable {
	    NDv21 nDv2_0 = new NDv21((-1297), (-1297), (-1297));
	    String string0 = nDv2_0.run((-1297), (-1297), (-1297));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(2, 2, 2);
	    String string0 = nDv2_0.run(2, 29, 1801);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv25() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1825, 1825, 1825);
	    String string0 = nDv2_0.run(4, 31, 1825);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv26() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1825, 1825, 1825);
	    String string0 = nDv2_0.run(6, 30, 1825);
	    assertEquals("7/1/1825", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv23() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1845, 1845, 1845);
	    String string0 = nDv2_0.run(3, 31, 1845);
	    assertEquals("4/1/1845", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv24() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(11, 11, 11);
	    String string0 = nDv2_0.run(11, 11, 1801);
	    assertEquals("11/12/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv21() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1825, 1825, 1825);
	    String string0 = nDv2_0.run(2, 1825, 1825);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv22() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(1825, 1825, 1825);
	    String string0 = nDv2_0.run(1, 1, 1825);
	    assertEquals("1/2/1825", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv20() throws Throwable {
	    NDv21 nDv2_0 = new NDv21(2, 2, 2);
	    String string0 = nDv2_0.run(2, 3856, 3856);
	    assertEquals("invalid Input Date", string0);
	}

}