package Main;

import Entities.Data;

public class Calculator {
	public static void main(String[] args) {
		Data d=new Data(30,10);
		d.setAddition();
		d.setDivison();
		d.setMultiplication();
		d.setSubtraction();
		
		System.out.println("Addition is: "+d.getAddition());
		System.out.println("Subtraction is: "+d.getSubtraction());
		System.out.println("Divison is: "+d.getDivison());
		System.out.println("Multiplication is: "+d.getMultiplication());
	}
}
