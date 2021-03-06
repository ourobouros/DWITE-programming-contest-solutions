/* 
 * DWITE programming contest solutions
 * November 2008 - Problem 4: "Big shiny tunes"
 * Copyright (c) Project Nayuki. All rights reserved.
 * 
 * https://www.nayuki.io/page/dwite-programming-contest-solutions
 * https://github.com/nayuki/DWITE-programming-contest-solutions
 */


public final class dwite200811p4 extends DwiteSolution {
	
	public static void main(String[] args) {
		new dwite200811p4().run("DATA4.txt", "OUT4.txt");
	}
	
	
	protected void runOnce() {
		// best[i] represents the maximum total rating achievable using at most i amount of space
		int capacity = io.readIntLine();
		int[] best = new int[capacity + 1];
		
		int albums = io.readIntLine();
		for (int i = 0; i < albums; i++) {
			io.tokenizeLine();
			int size = io.readIntToken();
			int utility = io.readIntToken();
			for (int j = capacity; j >= size; j--)
				best[j] = Math.max(best[j - size] + utility, best[j]);
		}
		io.println(best[capacity]);
		io.readLine();  // Discard blank line
	}
	
}
