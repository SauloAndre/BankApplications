package classes;

public class Person {
	
	private static int counter = 1;

	private String name;
	private String cpf;
	private String email;
	private String selectBank;
	
	public Person(String name, String cpf, String email, String selectBank) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.selectBank = selectBank;
		counter += 1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSelectBank() {
		return selectBank;
	}
	public void setSelectBank(String selectBank) {
		this.selectBank = selectBank;
	}
	
	public String toString() {
		return "/nName" + this.getName() +
				"/nCPF" + this.getCpf() +
				"/nEmail" + this.getEmail() +
				"/nSelected Bank" + this.getSelectBank();
				
	}
	
}