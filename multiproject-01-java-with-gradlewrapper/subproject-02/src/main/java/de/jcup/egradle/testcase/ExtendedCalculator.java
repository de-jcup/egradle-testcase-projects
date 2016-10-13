package de.jcup.egradle.testcase;

public class ExtendedCalculator extends Calculator{

	public int getResult(){
		return result;
	}
	
	public void minus(int add){
		result-=add;
	}
}
