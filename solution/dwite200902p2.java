/* 
 * DWITE programming contest solutions
 * February 2009 - Problem 2: "Kill Dash Nine"
 * Copyright (c) Project Nayuki. All rights reserved.
 * 
 * https://www.nayuki.io/page/dwite-programming-contest-solutions
 * https://github.com/nayuki/DWITE-programming-contest-solutions
 */


public final class dwite200902p2 extends DwiteSolution {
	
	public static void main(String[] args) {
		new dwite200902p2().run("DATA2.txt", "OUT2.txt");
	}
	
	
	protected void runOnce() {
		io.tokenizeLine();
		if (!io.readToken().equals("kill"))
			throw new IllegalArgumentException();
		int sig = -io.readIntToken();
		
		for (int i = 0; i < 5; i++) {
			io.tokenizeLine();
			String name = io.readToken();
			if (io.readIntToken() > sig)
				io.println(name);
		}
	}
	
}
