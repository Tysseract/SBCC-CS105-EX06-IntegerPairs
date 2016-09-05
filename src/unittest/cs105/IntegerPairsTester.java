package unittest.cs105;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.IntegerPairs;

public class IntegerPairsTester {
	private static final int maximumScore = 8;
	private static final int maximumAssignmentScore = 12;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void check1122() throws Exception {
		assertEquals("Output should match!", "two pairs", IntegerPairs.countPairs(1, 1, 2, 2));

		totalScore += 1;
	}

	@Test
	public void check1423() throws Exception {
		assertEquals("Output should match!", "two pairs", IntegerPairs.countPairs(1, 2, 2, 1));

		totalScore += 1;
	}
	
	@Test
	public void check1212() throws Exception {
		assertEquals("Output should match!", "two pairs", IntegerPairs.countPairs(1, 2, 1, 2));

		totalScore += 2;
	}

	@Test
	public void checkNone() throws Exception {
		assertEquals("Output should match!", "not two pairs", IntegerPairs.countPairs(1, 2, 3, 4));

		totalScore += 2;
	}

	@Test
	public void checkThree() throws Exception {
		assertEquals("Output should match!", "not two pairs", IntegerPairs.countPairs(1, 1, 1, 2));

		totalScore += 2;
	}

}
