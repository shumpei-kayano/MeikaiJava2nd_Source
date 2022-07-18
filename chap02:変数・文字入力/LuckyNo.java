// 0～9のラッキーナンバーを乱数で生成して表示
// 乱数の生成

//Randomクラスをimport
import java.util.Random;

class LuckyNo {

	public static void main(String[] args) {
		//Randomのインスタンスを生成
		Random rand = new Random();
		//メソッドを使用し、乱数生成
		int lucky = rand.nextInt(10);			// 0～9の乱数

		System.out.println("今日のラッキーナンバーは" + lucky + "です。");
	}
}

/* Randomクラスのメソッド
 * nextBoolean() true または false
 * nextInt()
 * nextInt(n) 0~n-1
 * nextLong()
 * nextDouble()
 * nextFloat()
 */
