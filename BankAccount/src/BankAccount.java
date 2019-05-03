
import java.math.BigDecimal;
import java.math.MathContext;

public class BankAccount {

	public static void main(String[] args) {
		 BankAccount account = new BankAccount(1000);
		    account.deposit(500);
		    account.withdraw(50);

		    System.out.println("BankAccount " + account.getNumber());
		    System.out.println("Has a balance of " + account.getBalance());
	}
	

	  // These are different for each account
	  private BigDecimal balance;
	  private int accountNumber;

	  // This is shared by all accounts, so it's static
	  private static int lastAccountNumber = 0;

	  // This is a constructor: no return type (void, boolean etc) and has the same name as the class.
	  public BankAccount(double initialBalance)   {
	    balance = new BigDecimal(initialBalance, MathContext.DECIMAL64); 
	    		
	    accountNumber = lastAccountNumber + 1;
	    lastAccountNumber = accountNumber;
	  }

	  public void deposit(double depositAmount) {
		try {
			balance.add(new BigDecimal(depositAmount, MathContext.DECIMAL64));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	  }

	  public boolean withdraw(double amount) {
		try {
			BigDecimal withdrawAmount = new BigDecimal(amount, MathContext.DECIMAL64);
		    if (withdrawAmount.compareTo(balance) > 0) {    
		      System.out.println("Insufficient Funds!!!");
		      return false;
		    } else {
		      balance.subtract(withdrawAmount);
		      return true;
		    }
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return false;
	  }

	  public int getNumber() {
	    return accountNumber;
	  }

	  public BigDecimal getBalance() {
	    return balance;
	  }

}
