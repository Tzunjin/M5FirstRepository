package m5junitex5;

import java.util.ArrayList;

public class PrimeAverage {
	private ArrayList<Integer> inputArray1;
	private ArrayList<Integer> inputArray2;

	//Comentario para github

	
	PrimeAverage(ArrayList<Integer> myArray1, ArrayList<Integer> myArray2) {
		inputArray1 = myArray1;
		inputArray2 = myArray2;
	}

	public boolean returnPrimeAV() {
		double aux;
		double avg1 = 0, avg2 = 0;
		boolean prime = true;

		for (Integer anInputArray1 : inputArray1) {
			avg1 += anInputArray1;
		}

		//Comentario para github en local

		avg1 = avg1 / inputArray1.size();
		avg1 = Math.round(avg1);

		for (Integer anInputArray2 : inputArray2) {
			avg2 += anInputArray2;
		}

		avg2 = avg2 / inputArray2.size();
		avg2 = Math.round(avg2);

		aux = avg1 + avg2;

		if (aux <= 0) {
			return false;
		}

		int p = 2;
		while (p <= Math.ceil(Math.sqrt(aux)) && prime == true) {
			if (aux % p == 0) {
				prime = false;
			}
			p++;
		}

		return prime;
	}
}
