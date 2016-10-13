package de.jcup.egradle.testcase;

public class Calculator {

	protected int result;

	public void add(int add){
		result+=add;
	}
	
	public int getResult(){
		return result;
	}
}
