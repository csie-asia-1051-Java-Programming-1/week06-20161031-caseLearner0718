package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ʧO");
		System.out.println("�k=1,�k=2");
		int which = scn.nextInt();
		System.out.println("�п�J����");
		int weight = scn.nextInt();
		count(which,weight);
	}
	public static void count(int which,int weight){
		if(which==1){
			System.out.print((float)(weight-170)*0.6+62);
		}else if(which==2){
			System.out.print((float)(weight-158)*0.5+52);
		}
	}
}
