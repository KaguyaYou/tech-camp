package test;

// 文字を出力するプログラム
//複数行出力するプログラム
//演算を行うプログラム
//git push

public class test2 {

	public static void main(String[] args) {               //javaプログラムを実行するために必要な形式的なもの
		
		
		//文字列結合演算子
		
		
		System.out.println("あなたの名前は？");
		
		String input1 = new java.util.Scanner(System.in).nextLine(); //文字列
		
		System.out.println("あなたの年齢は？");
		int input2 = new java.util.Scanner(System.in).nextInt(); //整数
		
		System.out.println("こんにちは" + input2 + "歳の" + input1 + "さん");

	}

}
