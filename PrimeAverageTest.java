package m5junitex5;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeAverageTest {
	private PrimeAverage p1;
	private PrimeAverageRefactor p2;

	private boolean expected;
	private ArrayList<Integer> inputArray1;
	private ArrayList<Integer> inputArray2;

	@Parameters
	public static Collection<Object[]> testParam() {
		return Arrays.asList(new Object[][] {
				// 3 + 3 = 6 false
				{ false, new ArrayList<>(Arrays.asList(4, 4, 3, 3)), new ArrayList<>(Arrays.asList(4, 4, 3, 3)) },
				// 4 + 4 = 8 false
				{ false, new ArrayList<>(Arrays.asList(2, 8, 1, 5)), new ArrayList<>(Arrays.asList(3, 1, 6, 8)) },
				// 6 + 6 = 12 false
				{ false, new ArrayList<>(Arrays.asList(6, 8, 5, 4)), new ArrayList<>(Arrays.asList(6, 4, 5, 9)) },
				// 4 + 5 = 9 false
				{ false, new ArrayList<>(Arrays.asList(4, 9, 1, 3)), new ArrayList<>(Arrays.asList(3, 4, 6, 9)) },
				// 10 + 7 = 17 true
				{ true, new ArrayList<>(Arrays.asList(15, 5, 15, 3)), new ArrayList<>(Arrays.asList(6, 7, 8, 7)) },
				// 5 + 8 = 13 true
				{ true, new ArrayList<>(Arrays.asList(3, 1, 6, 8)), new ArrayList<>(Arrays.asList(16, 8, 2, 7)) },
				// 17 + 12 = 29 true
				{ true, new ArrayList<>(Arrays.asList(42, 12, 6, 9)),
						new ArrayList<>(Arrays.asList(16, 10, 14, 7)) } });

	}

	public PrimeAverageTest(boolean esperat, ArrayList<Integer> myArray1, ArrayList<Integer> myArray2) {
		this.expected = esperat;
		this.inputArray1 = myArray1;
		this.inputArray2 = myArray2;
	}

	@Before
	public void instancia() {
		p1 = new PrimeAverage(inputArray1, inputArray2);
		p2 = new PrimeAverageRefactor(inputArray1, inputArray2);
	}

	@Test
	public void test1() {
		boolean calculat = p1.returnPrimeAV();
		assertEquals(this.expected, calculat);
	}

	@Test
	public void test2() {
		boolean calculat = p2.returnPrimeAV();
		assertEquals(this.expected, calculat);
	}
}
