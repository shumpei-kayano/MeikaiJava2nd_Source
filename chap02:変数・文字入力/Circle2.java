// 円周の長さと円の面積を求める（その２：円周率をfinal変数で表す）
// final変数で定数を宣言
// final変数は初期化が原則

import java.util.Scanner;

class Circle2 {

	public static void main(String[] args) {
		//↓final変数
		final double PI = 3.1416;			// 円周率
		Scanner stdIn = new Scanner(System.in);

		System.out.print("半径：");
		double r = stdIn.nextDouble();	// 半径

		System.out.println("円周の長さは" + 2 * PI * r + "です。");
		System.out.println("面積は" + PI * r * r + "です。");
	}
}
