package com.capgemini.coins;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ldrygala on 2015-02-06.
 * <p/>
 * Consider N coins aligned in a row. Each coin is showing either heads or
 * tails. The adjacency of these coins is the number of adjacent pairs of coins
 * with the same side facing up.
 * <p/>
 * It must return the maximum possible adjacency that can be obtained by
 * reversing exactly one coin (that is, one of the coins must be reversed).
 * Consecutive elements of array A represent consecutive coins in the row. Array
 * A contains only 0s and/or 1s: 0 represents a coin with heads facing up; 1
 * represents a coin with tails facing up. For example, given array A consisting
 * of six numbers, such that:
 * <p/>
 * A[0] = 1 A[1] = 1 A[2] = 0 A[3] = 1 A[4] = 0 A[5] = 0
 * <p/>
 * the function should return 4. The initial adjacency is 2, as there are two
 * pairs of adjacent coins with the same side facing up, namely (0, 1) and (4,
 * 5). After reversing the coin represented by A[2], the adjacency equals 4, as
 * there are four pairs of adjacent coins with the same side facing up, namely:
 * (0, 1), (1, 2), (2, 3) and (4, 5), and it is not possible to obtain a higher
 * adjacency. The same adjacency can be obtained by reversing the coin
 * represented by A[3].
 */
public class Coins {

	/**
	 * Given a list of 0's and 1's count maximum adjacency we can achieve by
	 * flipping one coin
	 * 
	 * @param coins
	 * @return maximum adjacency found
	 */
	public static int solution(List<Integer> coins) {
		for (int i = 0; i < coins.size(); i++) {
			int tmp = coins.get(i);
			if (tmp != 1 && tmp != 0) {
				System.err.println("List can conatin only 1's or 0's");
				return -1;
			}
		}

		int max = countAdj(coins);

		for (int i = 0; i < coins.size(); i++) {
			coins.set(i, (coins.get(i) + 1) % 2);
			int current = countAdj(coins);
			if (current > max) {
				max = current;
			}
			coins.set(i, (coins.get(i) + 1) % 2);
		}
		return max;
	}

	/**
	 * Counts adjacency of given list
	 * 
	 * @param list
	 * @return calculated adjacency
	 */
	private static int countAdj(List<Integer> list) {
		int pairs = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) == list.get(i + 1)) {
				pairs++;
			}
		}
		return pairs;
	}
}
