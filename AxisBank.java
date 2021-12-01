package org.bank;

public class AxisBank extends BankInfo{
	
	@Override
	public void deposit() {
		
		//super.deposit();
		
		System.out.println("overriding deposit");
		
	}

	
	public static void main(String[] args) {
		
	   AxisBank objDeposit=new AxisBank();
	   
	   objDeposit.deposit();
		
		
		
		
	}
	
}
