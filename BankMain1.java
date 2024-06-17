class Bank{
	public void InterestRate(){
		System.out.println("The interest rate of a normal bank: 5%");
	}
}
class UBI extends Bank{
	@Override
	public void InterestRate(){
		System.out.println("The interest rate of a UBI (Union Bank of India) bank: 7%");
	}
}
class ICICI extends Bank{
	@Override
	public void InterestRate(){
		System.out.println("The interest rate of a ICICI bank: 6.5%");
	}
}
class HDFC extends Bank{
	@Override
	public void InterestRate(){
		System.out.println("The interest rate of a HDFC bank: 7%");
	}
}
class BOB extends Bank{
	@Override
	public void InterestRate(){
		System.out.println("The interest rate of a BOB (Bank od Boroda) bank: 6.5%");
	}
}
class SBI extends Bank{
	@Override
	public void InterestRate(){
		System.out.println("The interest rate of a SBI (State Bank of India) bank: 6%");
	}
}
class BankMain1{
	public static void main(String arg[]){
			Bank ubiBank = new UBI();
			ubiBank.InterestRate();
			
			Bank iciciBank = new ICICI();
			iciciBank.InterestRate();
			
			Bank hdfcBank = new HDFC();
			hdfcBank.InterestRate();
			
			Bank bobBank = new BOB();
			bobBank.InterestRate();
			
			Bank sbiBank = new SBI();
			sbiBank.InterestRate();
	}
}