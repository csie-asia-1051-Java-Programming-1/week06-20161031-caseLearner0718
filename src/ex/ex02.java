package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入m=");
		int m = scn.nextInt();
		System.out.println("請輸入n=");
		int n = scn.nextInt();
		System.out.print(count(m)/(count(n)*count(m-n)));
	}
	public static int count(int a){
		int val=1;
		for(int b = 1;b <= a;b++){
			val*=b;
		}
		return val;
	}

}
