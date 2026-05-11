/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		citronst = citronst - citronint;
		chokorast = chokorast - chokoraint;
		pistashust = pistashust - pistashuint;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン       \\250・・・残り" + citronst + "個");
		System.out.println("ショコラ       \\280・・・残り" + chokorast + "個");
		System.out.println("ピスターシュ   \\320・・・残り" + pistashust + "個");

	}

}
