package Entities;

public class Data {
	private double num1;
	private double num2;
	private double Addition;
	private double Subtraction;
	private double Multiplication;
	private double Divison;
	
	public Data(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getAddition() {
		return Addition;
	}

	public void setAddition() {
		this.Addition = this.num1+this.num2;
	}

	public double getSubtraction() {
		return Subtraction;
	}

	public void setSubtraction() {
		this.Subtraction = this.num1-this.num2;
	}

	public double getMultiplication() {
		return Multiplication;
	}

	public void setMultiplication() {
		this.Multiplication = this.num1*this.num2;
	}

	public double getDivison() {
		return Divison;
	}

	public void setDivison() {
		if(this.num2==0) {
			this.num2=0;
		}
		else {
			this.Divison = this.num1/this.num2;
		}
	}

	

	

	

}
