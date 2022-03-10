package m5junitex5;

import java.util.ArrayList;

public class PrimeAverageRefactor {
	private ArrayList<Integer> inputArray1;
	private ArrayList<Integer> inputArray2;

	PrimeAverageRefactor(ArrayList<Integer> myArray1, ArrayList<Integer> myArray2) {
		inputArray1 = myArray1;
		inputArray2 = myArray2;
	}

	public boolean returnPrimeAV() {
		return isPrime(calculateAvg(inputArray1) + calculateAvg(inputArray2));
	}

	private double calculateAvg(ArrayList<Integer> myArray) {
		double avg = 0;
		for (Integer anInputArray : myArray) {
			avg += anInputArray;
		}

		return Math.round(avg / myArray.size());
	}

	private boolean isPrime(double aux) {
		if (aux <= 0) {
			return false;
		}
		for (int p = 2; p <= Math.ceil(Math.sqrt(aux)); p++) {
			if (aux % p == 0) {
				return false;
			}
		}

		return true;
	}
}