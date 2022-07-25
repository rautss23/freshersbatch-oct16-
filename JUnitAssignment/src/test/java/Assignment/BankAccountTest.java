package Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	BankAccount cust;
	
	@BeforeAll
	void object_creation() {
		cust= new BankAccount(21, 5565655);
	}

	@Test
	void withdraw() {
		assertAll(
			()-> assertThrows(InsufficientBalanceException.class,()->cust.withdraw(9000000),"It is supposed to throw insufficient fund exception"),
			()-> assertThrows(InsufficientBalanceException.class,()->cust.withdraw(77898998),"It is supposed to throw Insufficient fund exception"));
		
		
	}

	

}
