package com.yedam.ref;

public class ArrayExample13 {
	public static void main(String[] args) {
		int[][] iAry = {
				{ 10, 20 }, // iAry[0]
				{ 30, 40, 50 }, // iAry[1]
				{ 60, 30 }, // iAry[2]
				{ 40 } // iAry[3]
		};

		for (int j = 0; j < iAry.length; j++) {
			for (int i = 0; i < iAry[j].length; i++) {
				System.out.print(iAry[j][i] + "  ");
			}
			System.out.println();
		}
	} // end of main
}