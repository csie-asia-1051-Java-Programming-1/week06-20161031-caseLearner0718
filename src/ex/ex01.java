package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個符號");
		char val = scn.nextLine().charAt(0);
		System.out.println("請輸入邊長");
		int n = scn.nextInt();
		square(val,n);
	}
	public static void square(char val, int n){
		for(int a = 1; a <= n; a++){
			for(int b = 1;b <= n; b++){
				System.out.print(val);
			}
			System.out.println();
		}
	}

}
