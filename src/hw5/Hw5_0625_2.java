package hw5;

public class Hw5_0625_2 {
//	利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳,如圖:
	public int maxElement(int x[][]) {
		int maxint = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxint < x[i][j]) {
					maxint = x[i][j];
				}
			}
		}
		return maxint;
	}

	public double maxElement(double x[][]) {

		double maxdouble = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxdouble < x[i][j]) {
					maxdouble = x[i][j];
				}
			}
		}
		return maxdouble;
	}

	public static void main(String[] args) {
		Hw5_0625_2 w = new Hw5_0625_2();
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}
}
