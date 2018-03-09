import java.io.Reader;
import java.util.Scanner;
import java.util.Random;

public class Lesson2 {
	
	public static void main(String[] args) {
		// szamologep
		System.out.println("myilen muveletet szeretnel vegezni? 1:osszeadas,2:kivonas,3:szorzas,4:osztas");
		Scanner scanner=new Scanner(System.in);
		int muvelet=scanner.nextInt();
		System.out.println("number1");
		double num1=scanner.nextDouble();
		System.out.println("number2");
		
		double num2=scanner.nextDouble();
		double sum=0;
		
		if(muvelet==1) {
			sum=num1+num2;
			System.out.println(sum);
		}
		if(muvelet==2) {
			sum=num1-num2;
			System.out.println(sum);
		}
		if(muvelet==3) {
			sum=num1*num2;
			System.out.println(sum);
		}
		if(muvelet==4) {
			sum=num1/num2;
			System.out.println(sum);
		}
		//2 bekerés egy sorban
		//	System.out.println("calculation");
		//	String cal=scanner.nextLine();
		//	double first=Double.parseDouble(cal.split(" ")[0]);
		//	double second=Double.parseDouble(cal.split(" ")[2]);
		//	String operator=cal.split(" ")[1];
		
		//
		
		//randomszam
		System.out.println();
		int[] block =new int[10];
		Random r=new Random();
		for (int i = 0; i < block.length; i++) {
			block[i]=r.nextInt(50)+1;
			System.out.println(block[i]);
		}
		//forechel ugyanez
		System.out.println();
		for(int element : block) {
			System.out.println(element);
		}
		//double random
		System.out.println();
		int random=(int )(Math.random()*50)+1;
		for (int i = 0; i < block.length; i++) {
			block[i]=random;
			System.out.println(block[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}


