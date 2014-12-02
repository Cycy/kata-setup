package primes;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Primes {

    public List<Integer> factorsOf(int i) {
	List<Integer> factors = new ArrayList<Integer>();
	int potentialPrime = 2;
	while (i / potentialPrime >= 1 && i % potentialPrime == 0) {
	    factors.add(potentialPrime);
	    i = i/potentialPrime;
	}
	while (i / 3 >= 1 && i % 3 == 0) {
	    factors.add(3);
	    i = i/3;
	}
	while (i / 4 >= 1 && i % 4 == 0) {
	    factors.add(4);
	    i = i/4;
	}
	while (i / 5 >= 1 && i % 5 == 0) {
	    factors.add(5);
	    i = i/5;
	}
	return factors;
    }

}
