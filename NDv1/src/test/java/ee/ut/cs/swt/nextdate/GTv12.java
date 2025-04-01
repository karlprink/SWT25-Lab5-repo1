package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testRunWithPositive20() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(8, 11, 11);
	    String string0 = nDv12_0.run(11, 1, 2018);
	    assertEquals("11/2/2018", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive21() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(1837, 28, 822);
	    String string0 = nDv12_0.run(8, 31, 1801);
	    assertEquals("9/1/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive9() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(12, 12, 1827);
	    String string0 = nDv12_0.run(12, 31, 1827);
	    assertEquals("1/1/1828", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive8() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(12, 2020, 2020);
	    String string0 = nDv12_0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive19() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(6, 6, 1905);
	    String string0 = nDv12_0.run(6, 30, 1905);
	    assertEquals("7/1/1905", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithNegative() throws Throwable {
	    NDv2 nDv12_0 = new NDv2((-35), (-35), (-35));
	    String string0 = nDv12_0.run((-35), 444, (-2915));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive10() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(7, 7, 7);
	    String string0 = nDv12_0.run(7, 7, 1824);
	    assertEquals("7/7/1824", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive13() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 2, 1852);
	    String string0 = nDv12_0.run(2, 28, 1852);
	    assertEquals("2/29/1852", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive14() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 2, 1843);
	    String string0 = nDv12_0.run(2, 30, 1843);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive11() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 2, 1843);
	    String string0 = nDv12_0.run(2, 2, 1843);
	    assertEquals("2/3/1843", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive12() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 2, 1847);
	    String string0 = nDv12_0.run(2, 29, 1847);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive17() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(1883, 5, 5);
	    String string0 = nDv12_0.run(5, 5, 1883);
	    assertEquals("5/6/1883", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive18() throws Throwable {
	    NDv2 nDv12_0 = new NDv2((-35), (-35), (-35));
	    String string0 = nDv12_0.run(8, 4, 1902);
	    assertEquals("8/5/1902", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive15() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 2, 1836);
	    String string0 = nDv12_0.run(2, 29, 1836);
	    assertEquals("3/1/1836", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithNegativeAndRunWithPositive() throws Throwable {
	    NDv2 nDv12_0 = new NDv2((-35), (-35), (-35));
	    String string0 = nDv12_0.run((-35), (-35), 444);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive16() throws Throwable {
	    NDv2 nDv12_0 = new NDv2((-35), (-35), (-35));
	    String string0 = nDv12_0.run(1, 4, 1902);
	    assertEquals("1/5/1902", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(5789, 2871, 5789);
	    String string0 = nDv12_0.run(12, 3, 2871);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NDv2 nDv12_0 = new NDv2((-35), (-35), (-35));
	    String string0 = nDv12_0.run(4, 4, 2018);
	    assertEquals("4/5/2018", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive3() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(10, 10, 1839);
	    String string0 = nDv12_0.run(10, 10, 1839);
	    assertEquals("10/11/1839", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(3, 3, 1843);
	    String string0 = nDv12_0.run(3, 1843, 1843);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive5() throws Throwable {
	    NDv2 nDv12_0 = new NDv2((-35), (-35), (-35));
	    String string0 = nDv12_0.run(2, 28, 2018);
	    assertEquals("3/1/2018", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive4() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(3, 3, 3);
	    String string0 = nDv12_0.run(3, 31, 1942);
	    assertEquals("4/1/1942", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive7() throws Throwable {
	    NDv2 nDv12_0 = new NDv2((-2146), 28, (-2146));
	    String string0 = nDv12_0.run(12, 1, 1859);
	    assertEquals("12/2/1859", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive6() throws Throwable {
	    NDv2 nDv12_0 = new NDv2((-1), 9, 9);
	    String string0 = nDv12_0.run(9, 31, 1942);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative1() throws Throwable {
	    NDv2 nDv12_0 = new NDv2((-35), (-35), (-35));
	    String string0 = nDv12_0.run(3623, 3623, (-1));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative0() throws Throwable {
	    NDv2 nDv12_0 = new NDv2((-35), (-35), (-35));
	    String string0 = nDv12_0.run(1, 4, (-2915));
	    assertEquals("invalid Input Date", string0);
	}

}