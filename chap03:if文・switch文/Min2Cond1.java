// 読み込んだ二つの整数値の小さいほうの値を表示（条件演算子：その１）

import java.util.Scanner;

class Min2Cond1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		int min = a < b ? a : b;		// 3項演算子
		System.out.println("小さいのは" + min + "です。");
	}
}
