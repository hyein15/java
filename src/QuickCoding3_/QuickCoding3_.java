package QuickCoding3_;

import java.io.IOException;
import java.util.Scanner;


public class QuickCoding3_ {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		Scanner num1 = new Scanner(System.in);
		
		Scanner num2 = new Scanner(System.in);
		
		System.out.println("나누어질 수를 입력하세요");
		String num1_ = num1.next();
		System.out.println("나눌수를 입력하세요");
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
		System.out.println("숫자를 입력하세요");
	
	}catch(ArithmeticException e){
		System.out.println("0으로 나눌 수 없습니다");
	}catch(IOException e){
		System.out.println("2자리 이하로 입력해주세요");
	}
	

	}
}
