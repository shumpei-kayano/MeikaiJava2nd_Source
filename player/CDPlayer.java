//===== ＣＤプレーヤ =====//
public class CDPlayer implements Player {

	@Override public void play() {							// ○再生
		System.out.println("**ＣＤ再生開始！"); 
	}

	@Override public void stop() {							// ○停止
		System.out.println("**ＣＤ再生終了！"); 
	}

	public void cleaning() {										// クリーニング
		System.out.println("**ヘッドをクリーニングしました。"); 
	}
}
