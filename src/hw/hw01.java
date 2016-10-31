package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個溫度值=");
		float v1 = scn.nextFloat();
		System.out.println("請輸入計算方式");
		System.out.println("1=華氏->攝氏");
		System.out.println("2=攝氏->華氏");
		int type = scn.nextInt();
		fun(v1,type);
	}
	public static void fun(float v1,int type){
		if(type==1){
			System.out.println((float)(v1-32)*(5f/9f));
		}else if(type==2){
			System.out.println((float)(v1*9f/5f+32));
		}
	}

}
