package QuickCoding3_;

import java.io.IOException;
import java.util.Scanner;


public class QuickCoding3_ {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		Scanner num1 = new Scanner(System.in);
		
		Scanner num2 = new Scanner(System.in);
		
		System.out.println("�������� ���� �Է��ϼ���");
		String num1_ = num1.next();
		System.out.println("�������� �Է��ϼ���");
		String num2_ = num2.next();
		

	try{
		
		int int_num = Integer.parseInt(num1_);
		int int_num2 = Integer.parseInt(num2_);

		if(int_num >= 100 || int_num2 >=100)
		{
			throw new IOException();
		}
	
		int div = int_num/int_num2;
		
		System.out.println(div);		
		
	}catch (NumberFormatException e){
		System.out.println("���ڸ� �Է��ϼ���");
	
	}catch(ArithmeticException e){
		System.out.println("0���� ���� �� �����ϴ�");
	}catch(IOException e){
		System.out.println("2�ڸ� ���Ϸ� �Է����ּ���");
	}
	

	}
}
