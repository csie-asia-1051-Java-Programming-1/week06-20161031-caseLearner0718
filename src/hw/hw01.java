package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�@�ӷū׭�=");
		float v1 = scn.nextFloat();
		System.out.println("�п�J�p��覡");
		System.out.println("1=�ؤ�->���");
		System.out.println("2=���->�ؤ�");
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
