package cx.ath.dekosuke.ftbt;

//One thread Activity for Futaba

//import android.graphics.*;

public class FutabaThreadContent {
	public String userName;
	public String title;
	public String text;
	public String mailTo;
	public int id;
	public String imgURL;
	public String threadNum;
	public String resNum;

	// 投稿時刻private date
	// 画像private

	// コンストラクタ
	FutabaThreadContent() {
		userName = "";
		title = "";
		text = "";
		mailTo = "";
		id = 0;
		resNum="";
	}
}