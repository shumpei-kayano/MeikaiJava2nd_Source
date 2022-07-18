// 識別子の有効範囲を確認する

class Scope {

	//複数のメソッドで共有する変数（フィールド）はstaticをつけて宣言する
	static int x = 700;

	//PrintXメソッド
	static void printX() {
		System.out.println("x = " + x);
	}

	public static void main(String[] args) {
		System.out.println("x = " + x); //staticのx 700が出力

		int x = 800; //局所変数 staticとは別のx

		System.out.println("x = " + x); //局所変数の 800が出力

		System.out.println("Scope.x = " + Scope.x); //staticのx 700が出力

		printX(); //staticのx 700が出力
	}
}
