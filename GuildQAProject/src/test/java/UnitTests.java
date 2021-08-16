package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import main.java.DogShelter;

public class UnitTests {

	// Happy path Test Case
	@Test
	public void test1() {
		int[] numDogs = new int[] { 5, 3, 7 };
		float output = DogShelter.orderFood(numDogs, 17);
		System.out.println(output);
		Assert.assertEquals(363.6f, output, 0);
	}

	// Total number of dogs exceed shelter capacity
	@Test
	public void test2() {
		int[] numDogs = new int[] { 12, 12, 12 };
		float output = DogShelter.orderFood(numDogs, 15);
		Assert.assertEquals(0f, output, 0);
	}

	// Total number of dogs equal to Zero
	@Test
	public void test3() {
		int[] numDogs = new int[] { 0, 0, 0 };
		float output = DogShelter.orderFood(numDogs, 15);
		Assert.assertEquals(0f, output, 0);
	}

	// Left over food is more than required food
	@Test
	public void test4() {
		int[] numDogs = new int[] { 1, 0, 0 };
		float output = DogShelter.orderFood(numDogs, 15);
		Assert.assertEquals(0f, output, 0);
	}

	// Total number of dogs equal to 30
	@Test
	public void test5() {
		int[] numDogs = new int[] { 10, 10, 10 };
		float output = DogShelter.orderFood(numDogs, 15.5f);
		Assert.assertEquals(701.4f, output, 0);
	}
}