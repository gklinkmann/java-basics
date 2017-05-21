package de.koo.javabasics.examples.calculator;

public class Fraction {
	private Integer dividend, divisor;

	public Fraction(Integer dividend, Integer divisor) {
		this.dividend = dividend;
		this.divisor = divisor;
	}

	public Integer getDividend() {
		return dividend;
	}

	public void setDividend(Integer dividend) {
		this.dividend = dividend;
	}

	public Integer getDivisor() {
		return divisor;
	}

	public void setDivisor(Integer divisor){
		if (divisor==0) {
			throw new NumberFormatException("fraction by zero is undefined");
		} else {
			this.divisor=divisor;
		}
	}

	public Double calculate(){
		return this.dividend.doubleValue() / this.divisor.doubleValue();
	}

	public void inverse(){
		Integer tmpDividend=this.dividend;
		this.dividend=this.divisor;
		this.divisor=tmpDividend;
	}

	public void duplicate(){
		this.dividend*=2;
	}

	public void half(){
		this.divisor*=2;
	}
	
	public String toString(){
		return this.dividend.toString() + " / " + this.divisor.toString() ;
	}
}
