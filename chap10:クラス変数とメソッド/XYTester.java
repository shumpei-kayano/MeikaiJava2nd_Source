// 識別番号付きＸＹクラス

class XY {
	private static int counter = 0;	// 何番までの識別番号を与えたか
	private int id;									// 識別番号

	private int x = 0;	// Ｘ
	private int y = 0;	// Ｙ

	//インスタンス初期化子
	/*
	 * クラス内の全コンストラクタで共通に行うべき処理（インスタンス生成のたびに必ず行うべき処理）
	 * があれば、インスタンス初期化子として独立させる。
	 */
	{
		id = ++counter;
	}

	public XY()             { }
	public XY(int x)        { this.x = x; }
	public XY(int x, int y) { this.x = x; this.y = y; }

	public String toString() {
		return "No." + id + " … (" + x  + ", " + y + ")";
	}
}

public class XYTester {

	public static void main(String[] args) {
		XY a = new XY();					// ( 0,  0)で初期化
		XY b = new XY(10);				// (10,  0)で初期化
		XY c = new XY(20, 30);		// (20, 30)で初期化

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
