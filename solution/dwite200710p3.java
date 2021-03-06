/* 
 * DWITE programming contest solutions
 * October 2007 - Problem 3: "Where's my QWERTY?"
 * Copyright (c) Project Nayuki. All rights reserved.
 * 
 * https://www.nayuki.io/page/dwite-programming-contest-solutions
 * https://github.com/nayuki/DWITE-programming-contest-solutions
 */


public final class dwite200710p3 extends DwiteSolution {
	
	public static void main(String[] args) {
		new dwite200710p3().run("DATA3.txt", "OUT3.txt");
	}
	
	
	private static final String DVORAK = "[]',.pyfgcrl/=aoeuidhtns-;qjkxbmwvz{}\"<>PYFGCRL?+AOEUIDHTNS_:QJKXBMWVZ";
	private static final String QWERTY = "-=qwertyuiop[]asdfghjkl;'zxcvbnm,./_+QWERTYUIOP{}ASDFGHJKL:\"ZXCVBNM<>?";
	
	
	protected void run() {
		String str = io.readLine();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int index = DVORAK.indexOf(c);
			if (index != -1)
				io.print(QWERTY.charAt(index) + "");
			else
				io.print(c + "");
		}
		io.println();
	}
	
}
