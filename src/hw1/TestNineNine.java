package hw1;

public class TestNineNine {
	public static void main(String[] args) {
//			• 一：使用for迴圈+ while迴圈
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
//			• 二：使用for迴圈+ do while迴圈
		int a, b;
		for (a = 1; a <= 9; a++) {
			b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while (b <= 9);
			System.out.println();
		}
//			• 三：使用while迴圈+ do while迴圈         
		int c = 1, d;
		while (c <= 9) {
			d = 1;
			do {
				System.out.print(c + "*" + d + "=" + c * d + "\t");
				d++;
			} while (d <= 9);
			System.out.println();
			c++;
		}
	}
}
