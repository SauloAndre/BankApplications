package application;
import java.util.ArrayList;
import java.util.Scanner;
import classes.Account;
import classes.Person;

public class BankApplications {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Account> accountsBanks;
	
		public static void main(String[] args) {
			accountsBanks = new ArrayList<Account>();
			operations();
		}
		
	public static void operations() {
		
	
		System.out.println("[------------------------------------------------]");
		System.out.println("[--------- WELCOME TO THE CENTRAL BANK ----------]");
		System.out.println("[-*** CHOOSE THE OPTION FOR THE APPLICATIONS ***-]");
		System.out.println("[------------------------------------------------]");
		System.out.println("[------[   OPTION 1 - CREATE ACCOUNT    ]--------]");
		System.out.println("[------[   OPTION 2 - DEPOSIT           ]--------]");
		System.out.println("[------[   OPTION 3 - DRAFT             ]--------]");
		System.out.println("[------[   OPTION 4 - TRANSFER          ]--------]");
		System.out.println("[------[   OPTION 5 - LIST              ]--------]");
		System.out.println("[------[   OPTION 6 - GO OUT            ]--------]");
		
		int operation = scan.nextInt();
		
		switch(operation) {
		case 1:
			createAccount();
			break;
		case 2:
			deposit();
			break;
		case 3:
			draft();
			break;
		case 4:
			transfer();
			break;
		case 5:
			list();
			break;
		case 6:
			System.out.println("Good bye, thanks.");
			System.exit(0);
		default:
			System.out.println("Option wrong.");
			operations();
			break;
		}
	}
		
		public static void createAccount() {
			
			System.out.println("\nWrite your Name: ");
				String name = scan.next();
				
			System.out.println("\nWrite your CPF: ");
				String cpf = scan.next();
				
			System.out.println("\nWrite your Email: ");
				String email = scan.next();
				
			System.out.println("\nChoose the Bank you want: ");
				String selectBank = scan.next();
				
				Person person = new Person(name, cpf, email, selectBank);
				
				Account account = new Account(person);
				
				accountsBanks.add(account);
				
				System.out.println("Your acccount has been create successfully.");
				
				operations();
		}
		
		private static Account foundAccount(int numberAccount) {
			Account account = null;
			if(accountsBanks.size() > 0) {
				for(Account c: accountsBanks) {
					if(c.getNumberAccount() == numberAccount);
					account = c;
				}
			}
			return account;
		}
		public static void deposit() {
			System.out.println("Number of Account: ");
			int numberAccount = scan.nextInt();
			
			Account account = foundAccount(numberAccount);
			
			if(account != null) {
				System.out.println("what amount do you want to deposit?");
				Double valueDeposit = scan.nextDouble(); 
				
				account.deposit(valueDeposit);
				System.out.println("The value has been deposited successfully");
			}else {
				System.out.println("Account not found");
			}
			operations();
		}
	
		public static void draft() {
			System.out.println("Number of Account: ");
			int numberAccount = scan.nextInt();
			
			Account account = foundAccount(numberAccount);
			
			if(account != null) {
				System.out.println("what amount do you want to draft?");
				Double valueDraft = scan.nextDouble(); 
				
				account.draft(valueDraft);
				System.out.println("The value has been drafted successfully");
			}else {
				System.out.println("Account not found");
			}
			operations();
		}
		public static void transfer() {
			System.out.println("sender account number: ");
			int numberAccountSender = scan.nextInt();
			
			Account accountSender = foundAccount(numberAccountSender);
			
			if(accountSender != null) {
				System.out.println("recipient number: ");
				int numberAccountRecipient = scan.nextInt();
				
				Account accountRecipient = foundAccount(numberAccountRecipient);
				
				if(accountRecipient != null) {
					System.out.println("What transfer value: ");
					Double value = scan.nextDouble();
					
					accountSender.transfer(accountRecipient, value);
				}else {
					System.out.println("Transfer not found");
				}
				operations();
			}
		}
		
		public static void list() {
			if(accountsBanks.size() > 0) {
				for(Account account: accountsBanks) {
					System.out.println(account);
				}
				}else {
					System.out.println("Accounts not found");
			}
			operations();
		}
		
	}
