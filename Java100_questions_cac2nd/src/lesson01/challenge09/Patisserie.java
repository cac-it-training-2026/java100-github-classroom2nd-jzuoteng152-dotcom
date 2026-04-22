/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int citronst = 30;
		int chokorast = 30;
		int pistashust = 30;

		System.out.println("本日のおすすめ商品です。\n");

		System.out.println("シトロン       \\250・・・残り" + citronst + "個");
		System.out.println("ショコラ       \\280・・・残り" + chokorast + "個");
		System.out.println("ピスターシュ   \\320・・・残り" + pistashust + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)\n");
		System.out.println("シトロン      ＞");
		String citronbn = reader.readLine();
		double citronint = Double.parseDouble(citronbn);

		System.out.println("ショコラ       ＞");
		String chokorabn = reader.readLine();
		double chokoraint = Double.parseDouble(chokorabn);

		System.out.println("ピスターシュ   ＞");
		String pistashubn = reader.readLine();
		double pistashuint = Double.parseDouble(pistashubn);

		System.out.println("\nシトロン" + citronint + "個");
		System.out.println("ショコラ" + chokoraint + "個");
		System.out.println("ピスターシュ" + pistashuint + "個");

		double ttb = citronint + chokoraint + pistashuint;
		int ttp = (int) (250 * citronint + 280 * chokoraint + 320 * pistashuint);

		System.out.println("\n合計個数" + ttb + "個");
		System.out.println("合計金額" + ttp + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		citronst = (int) (citronst - citronint);
		chokorast = (int) (chokorast - chokoraint);
		pistashust = (int) (pistashust - pistashuint);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン       \\250・・・残り" + citronst + "個");
		System.out.println("ショコラ       \\280・・・残り" + chokorast + "個");
		System.out.println("ピスターシュ   \\320・・・残り" + pistashust + "個");

		int citronper = (int) ((250 * citronint) / ttp * 100);
		int chokoraper = (int) ((280 * chokoraint) / ttp * 100);
		int pistashuper = (int) ((250 * pistashuint) / ttp * 100);

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");

		System.out.println("売上の割合");
		System.out.println("売上合計       \\" + ttp);

		System.out.println("\n内訳");
		System.out.println("シトロン       \\" + (int) (250 * citronint) + "・・・" + citronper + "%");
		System.out.println("ショコラ       \\" + (int) (280 * chokoraint) + "・・・" + chokoraper + "%");
		System.out.println("ピスターシュ   \\" + (int) (320 * pistashuint) + "・・・" + pistashuper + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味    ・・・" + citronper + "%");
		System.out.println("ショコラの味     ・・・" + chokoraper + "%");
		System.out.println("ピスターシュの味   ・・・" + pistashuper + "%");

		System.out.println("\nが楽しめます!\n");

		System.out.println(("\n値段は\\" + ((ttp / (int) ttb) / 10 * 10) + "です。"));

	}

}
