package classes;
import models.ModelsUlti;

public class Account {

	private static int counterAccount = 1;
	
	private int numberAccount;
	private Person person;
	private Double balance = 0.0;
	
	public Account(Person person) {
		this.numberAccount = counterAccount;
		this.person = person;
		counterAccount += 1;
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}
	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Double getBalance() {
		return balance;
	} 
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "\nNumber Account: " + this.getNumberAccount() +
				"\nName: " + this.person.getName() +
				"\nCPF: " + this.person.getCpf() +
				"\nEmail: " + this.person.getEmail() +
				"\nSelected Bank: " + this.person.getSelectBank() +
				"\nBalance: : " + ModelsUlti.doubleToString(this.getBalance()) +
				"\n";
	}  
	
	public void deposit(Double value) {
		if(value > 0) {
			setBalance(getBalance() + value);
			System.out.println("Your deposit has been made successfully.");
		}else {
			System.out.println("We were unable to locate your deposit.");
		}
	}
	
	public void draft(Double value){
		if(value > 0 && this.getBalance() >= value) {
			setBalance(getBalance() - value);
		System.out.println("Youy draft has been made successfully.");
		}else {
		System.out.println("We were unable to locate your draft.");
	}
		}
	
	public void transfer(Account AccountForDeposit, Double value) {
		if(value > 00 && this.getBalance() >= value) {
			setBalance(getBalance() - value);
			
		AccountForDeposit.balance = AccountForDeposit.getBalance() + value;
		System.out.println("Transfer hans been made successfully");
		}else {
			System.out.println("We were unable to locate your tranfer");
		}
	}
}