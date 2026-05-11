
/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int citron = 30;
		int chokora = 30;
		int pistashu = 30;

		System.out.println("本日のおすすめ商品です。\n");

		System.out.println("シトロン       \\250・・・残り" + citron + "個");
		System.out.println("ショコラ       \\280・・・残り" + chokora + "個");
		System.out.println("ピスターシュ   \\320・・・残り" + pistashu + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)\n");
		System.out.println("シトロン      ＞");
		String citronbn = reader.readLine();
		int citronint = Integer.parseInt(citronbn);

		System.out.println("ショコラ       ＞");
		String chokorabn = reader.readLine();
		int chokoraint = Integer.parseInt(chokorabn);

		System.out.println("ピスターシュ   ＞");
		String pistashubn = reader.readLine();
		int pistashuint = Integer.parseInt(pistashubn);

		System.out.println("\nシトロン" + citronint + "個");
		System.out.println("ショコラ" + chokoraint + "個");
		System.out.println("ピスターシュ" + pistashuint + "個");

		int ttb = citronint + chokoraint + pistashuint;
		int ttp = 250 * citronint + 280 * chokoraint + 320 * pistashuint;

		System.out.println("\n合計個数" + ttb + "個");
		System.out.println("合計金額" + ttp + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

	}

}
